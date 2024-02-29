package SemIteratorExemplo2;
import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeComprasSemIterator {
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
