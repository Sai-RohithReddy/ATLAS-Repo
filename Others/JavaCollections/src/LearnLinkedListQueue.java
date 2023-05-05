import java.util.LinkedList;
import java.util.Queue;

public class LearnLinkedListQueue {
    public static void main(String[] args) {
        // Queues are first in first out
        // Queue can be implemented by ArrayList, LinkList, PriorityQueue

        Queue<Integer> queue = new LinkedList<>();
        queue.offer(12); // offer is used to add elements in queue
        queue.offer(24);
        queue.offer(36);
        System.out.println(queue);

        System.out.println(queue.peek()); // peek is used to see next in line element in queue

        System.out.println("Poll: " + queue.poll()); // poll removes first added element in queue
        System.out.println(queue);

        // alternative of above functions: offer() -> add(); peek() -> element(); poll() -> remove(). But alternates will block if elements are not theres
    }
}
