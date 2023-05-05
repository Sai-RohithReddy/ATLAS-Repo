import java.util.LinkedList;

public class LearnLinkedList {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.addFirst("is");
        list.addFirst("Hi");
        System.out.println(list);

        list.addLast("a");
        list.add("LinkedList"); // add() and addLast() does same
        list.add(1, "This"); // adding element in given index
        System.out.println(list);

        System.out.println(list.size());

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " -> ");
        }
        System.out.println("null");

        list.removeFirst(); // removes first element
        System.out.println(list);
        list.removeLast(); // removes last element
        System.out.println(list);
        list.remove(1); // removes element based on index given
        System.out.println(list);

    }

}
