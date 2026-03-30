import java.util.LinkedList;

public class Exp21 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        // Adding elements
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        System.out.println("Linked List before removal: " + list);

        // Remove all elements one by one
        while (!list.isEmpty()) {
            int removed = list.removeFirst();
            System.out.println("Removed: " + removed);
        }

        System.out.println("Linked List after removal: " + list);
        System.out.println("Is list empty? " + list.isEmpty());
    }
}