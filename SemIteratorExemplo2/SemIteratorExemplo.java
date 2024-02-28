package SemIteratorExemplo2;
import java.util.ArrayList;
import java.util.List;

class CarrinhoDeComprasSemIterator {
    private List<String> itens;

    public CarrinhoDeComprasSemIterator() {
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(String item) {
        this.itens.add(item);
    }

    public void exibirItens() {
        for (String item : itens) {
            System.out.println(item);
        }
    }
}

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
