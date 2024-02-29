package biblioteca_Iterator;

import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;

// Segunda classe representando outra coleção de livros (Aggregate)
class BibliotecaSecundaria implements Iterable<Livro> {
    private List<Livro> livros;

    public BibliotecaSecundaria() {
        this.livros = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    @Override
    public Iterator<Livro> iterator() {
        return new BibliotecaSecundariaIterator();
    }

    // Implementação do Iterator customizado para a segunda biblioteca
    private class BibliotecaSecundariaIterator implements Iterator<Livro> {
        private int index = 0;

        @Override
        public boolean hasNext() {
            return index < livros.size();
        }

        @Override
        public Livro next() {
            return livros.get(index++);
        }
    }
}