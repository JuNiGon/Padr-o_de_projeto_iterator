package ComIteratorExemplo2;

// Exemplo de Uso
public class ComIteratorExemplo {
    public static void main(String[] args) {
        CarrinhoDeComprasComIterator carrinho = new CarrinhoDeComprasComIterator();
        carrinho.adicionarItem("Produto A");
        carrinho.adicionarItem("Produto B");
        carrinho.adicionarItem("Produto C");

        // Usando Iterator para percorrer os itens
        MyIterator<String> iterator = carrinho.createIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
