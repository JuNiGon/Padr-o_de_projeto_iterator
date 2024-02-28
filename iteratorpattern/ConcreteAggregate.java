package iteratorpattern;

public class ConcreteAggregate implements Aggregate {
    private Object[] elements;

    public ConcreteAggregate(Object[] elements) {
        this.elements = elements;
    }

    public Iterator createIterator() {
        return new ConcreteIterator(elements);
    }
}
