package biblioteca_Iterator;

// Interface Iterator customizado para a coleção de livros
interface LivroIterator {
    boolean hasNext();
    Livro next();
}