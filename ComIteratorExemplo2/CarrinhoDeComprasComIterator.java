package ComIteratorExemplo2;
import java.util.ArrayList;
import java.util.List;

// Interface Iterator
interface MyIterator<T> {
    boolean hasNext();
    T next();
}

// Interface Aggregate
interface MyAggregate<T> {
    MyIterator<T> createIterator();
}

class CarrinhoDeComprasComIterator implements MyAggregate<String> {
    private List<String> itens;

    public CarrinhoDeComprasComIterator() {
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(String item) {
        this.itens.add(item);
    }

    @Override
    public MyIterator<String> createIterator() {
        return new CarrinhoIterator();
    }

    // Implementação do Iterator interno
    private class CarrinhoIterator implements MyIterator<String> {
        private int index = 0;

        @Override
        public boolean hasNext() {
            return index < itens.size();
        }

        @Override
        public String next() {
            return itens.get(index++);
        }
    }
}

