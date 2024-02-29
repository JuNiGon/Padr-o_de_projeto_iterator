package SemIteratorExemplo2;

// Exemplo de Uso
public class SemIteratorExemplo {
    public static void main(String[] args) {
        CarrinhoDeComprasSemIterator carrinho = new CarrinhoDeComprasSemIterator();
        carrinho.adicionarItem("Produto A");
        carrinho.adicionarItem("Produto B");
        carrinho.adicionarItem("Produto C");

        carrinho.exibirItens();
    }
}
