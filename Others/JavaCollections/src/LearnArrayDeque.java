import java.util.ArrayDeque;

public class LearnArrayDeque {
    public static void main(String[] args) {
        // Deque --> Double Ended Queue, we can add/remove/peek element from starting and ending
        // it is implemented by Queue

        ArrayDeque<Integer> dq= new ArrayDeque<>();

        dq.offer(23);
        dq.offerFirst(12); // it will add element at head
        dq.offerLast(45); // it will add element at last (offer and offerLast are doing same thing)

        System.out.println(dq);

        System.out.println(dq.peek());
        System.out.println(dq.peekFirst()); // peek and peekFirst are doing same, gives first element
        System.out.println(dq.peekLast()); // peekLast will give last added element

        dq.poll();
        dq.pollFirst(); // pool and poolFirst are doing same
        dq.pollLast(); // pollLast will remove last added element

        // by using ArrayDeque we can implement both stack and Queue


    }
}
