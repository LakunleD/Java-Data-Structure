import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;

public class TheQueues {
    public static void main(String[] args) {
        LinkedList<Person> linkedList = new LinkedList<>();
        linkedList.add(new Person("Olakunle", 32));
        linkedList.add(new Person("Qalbi", 28));
        ListIterator<Person> personListIterator = linkedList.listIterator();
        while (personListIterator.hasNext()) {
            System.out.println(personListIterator.next());
        }

    }

    private static void queues() {
        Queue<Person> supermarket = new LinkedList<>();
        supermarket.add(new Person("Olakunle", 32));
        supermarket.add(new Person("Ade", 31));
        supermarket.add(new Person("Alex", 18));

        System.out.println(supermarket.size());
        System.out.println(supermarket.peek());
        System.out.println(supermarket.poll());
        System.out.println(supermarket.size());
        System.out.println(supermarket.peek());
    }

    static record Person(String name, int age) {}
}
