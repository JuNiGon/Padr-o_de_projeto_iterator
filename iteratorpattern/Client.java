package iteratorpattern;

public class Client {
    public static void main(String[] args) {
        Object[] elements = { "A", "B", "C", "D" };
        Aggregate aggregate = new ConcreteAggregate(elements);
        Iterator iterator = aggregate.createIterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
