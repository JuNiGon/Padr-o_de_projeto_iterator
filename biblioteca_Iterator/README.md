1-  BIBLIOTECA ITERATOR

O código apresenta uma implementação simples do padrão de projeto Iterator em Java, focado em uma representação de uma biblioteca virtual. A estrutura inclui classes e interfaces que possibilitam a criação e iteração sobre coleções de livros.

## Principais Componentes

### 1. Livro
   - Classe que representa um livro com atributos como título, autor, e métodos para obter essas informações.

### 2. LivroIterator
   - Interface que define os métodos `hasNext()` e `next()` para criar um iterador customizado para a coleção de livros.

### 3. Biblioteca
   - Classe que implementa a interface `Iterable` e representa uma coleção de livros.
   - Possui um iterador interno (`BibliotecaIterator`) para percorrer os livros na biblioteca.

### 4. BibliotecaSecundaria
   - Outra classe representando uma segunda coleção de livros, similar à `Biblioteca`.

### 5. BibliotecaIterator
   - Implementação do iterador interno para a classe `Biblioteca`.
   - Permite iterar sobre os livros na biblioteca.

### 6. MultiBibliotecaIterator
   - Um iterador customizado que combina dois iteradores de bibliotecas diferentes, possibilitando a iteração sobre ambas as coleções de forma unificada.

## Exemplo de Uso

O exemplo no final do código demonstra como criar livros, adicionar à biblioteca e à biblioteca secundária, e finalmente, como iterar sobre a combinação de ambas as bibliotecas utilizando o `MultiBibliotecaIterator`.

Este código facilita a iteração sobre coleções de livros, proporcionando uma abstração que permite a adição de novas bibliotecas sem a necessidade de modificar o código de iteração existente.


2-  REPOSITÓRIO


https://github.com/JuNiGon/Padr-o_de_projeto_iterator/tree/main/biblioteca_Iterator



3- COMO USAR


Execute: ExemploIterator.java