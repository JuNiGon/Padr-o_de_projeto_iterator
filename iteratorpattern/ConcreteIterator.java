package iteratorpattern;

public class ConcreteIterator implements Iterator {
    private Object[] elements;
    private int position = 0;

    public ConcreteIterator(Object[] elements) {
        this.elements = elements;
    }

    public boolean hasNext() {
        return position < elements.length;
    }

    public Object next() {
        if (hasNext()) {
            return elements[position++];
        }
        return null;
    }
}
