import java.util.Comparator;
import java.util.PriorityQueue;

public class LearnPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(); // min heap will implemented
        PriorityQueue<Integer> pq2 = new PriorityQueue<>(Comparator.reverseOrder()); // max heap will get implemented

        pq.offer(40);
        pq.offer(12);
        pq.offer(24);
        pq.offer(36);
        System.out.println(pq);// order will be not same, under the hood min Heap will get implemented.
        // here first priority will be for min value

        System.out.println(pq.peek());
        pq.poll();
        System.out.println(pq);


    }
}
