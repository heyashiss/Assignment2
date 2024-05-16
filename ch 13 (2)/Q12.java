import java.util.*;

public class Q12 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 10, 8, 7, 3, 4, 6, 5, 9};
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        // Adding elements from the array to the priority queue
        for (int num : arr) {
            priorityQueue.add(num);
        }

        System.out.print("Priority Queue dequeue: ");

        // Polling elements from the priority queue
        while (!priorityQueue.isEmpty()) {
            System.out.print(priorityQueue.poll() + " ");
        }
    }
}
