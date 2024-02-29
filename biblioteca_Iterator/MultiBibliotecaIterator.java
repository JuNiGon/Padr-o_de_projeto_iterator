package biblioteca_Iterator;

import java.util.Iterator;

// Iterador que combina duas coleções
class MultiBibliotecaIterator implements LivroIterator {
    private Iterator<Livro> iteratorBiblioteca1;
    private Iterator<Livro> iteratorBiblioteca2;

    public MultiBibliotecaIterator(Iterator<Livro> iteratorBiblioteca1, Iterator<Livro> iteratorBiblioteca2) {
        this.iteratorBiblioteca1 = iteratorBiblioteca1;
        this.iteratorBiblioteca2 = iteratorBiblioteca2;
    }

    @Override
    public boolean hasNext() {
        return iteratorBiblioteca1.hasNext() || iteratorBiblioteca2.hasNext();
    }

    @Override
    public Livro next() {
        if (iteratorBiblioteca1.hasNext()) {
            return iteratorBiblioteca1.next();
        } else {
            return iteratorBiblioteca2.next();
        }
    }
}