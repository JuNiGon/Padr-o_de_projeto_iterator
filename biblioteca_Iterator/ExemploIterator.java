package biblioteca_Iterator;

public class ExemploIterator {

    public static void main(String[] args) {
        // Criando alguns livros
        Livro livro1 = new Livro("Java: The Complete Reference", "Herbert Schildt");
        Livro livro2 = new Livro("Design Patterns: Elements of Reusable Object-Oriented Software", "Erich Gamma, Richard Helm, Ralph Johnson, John Vlissides");
        Livro livro3 = new Livro("Clean Code: A Handbook of Agile Software Craftsmanship", "Robert C. Martin");
        Livro livro4 = new Livro("The Pragmatic Programmer: Your Journey to Mastery", "Dave Thomas, Andy Hunt");

        // Criando duas bibliotecas e adicionando livros
        Biblioteca biblioteca1 = new Biblioteca();
        biblioteca1.adicionarLivro(livro1);
        biblioteca1.adicionarLivro(livro2);

        BibliotecaSecundaria biblioteca2 = new BibliotecaSecundaria();
        biblioteca2.adicionarLivro(livro3);
        biblioteca2.adicionarLivro(livro4);

        // Iterando sobre a combinação de ambas as bibliotecas usando o iterador customizado
        MultiBibliotecaIterator multiIterator = new MultiBibliotecaIterator(biblioteca1.iterator(), biblioteca2.iterator());
        while (multiIterator.hasNext()) {
            Livro livro = multiIterator.next();
            System.out.println("Livro: " + livro.getTitulo() + ", Autor: " + livro.getAutor());
        }
    }
}