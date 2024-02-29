package biblioteca_Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Classe representando a coleção de livros (Aggregate)
class Biblioteca implements Iterable<Livro> {
    private List<Livro> livros;

    public Biblioteca() {
        this.livros = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    @Override
    public Iterator<Livro> iterator() {
        return new BibliotecaIterator();
    }

    // Implementação do Iterator customizado
    private class BibliotecaIterator implements Iterator<Livro> {
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
