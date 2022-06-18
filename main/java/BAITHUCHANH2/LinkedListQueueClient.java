package BAITHUCHANH2;

public class LinkedListQueueClient {
    public static void main(String[] args) {
        MyLinkedListQueue queue = new MyLinkedListQueue();
        queue.enqueue(10);
        queue.enqueue(12);
        queue.dequeue();
        System.out.println(queue.dequeue().key);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        System.out.println("Dequeued item is "+ queue.dequeue().key);
        System.out.println("Dequeued item is "+ queue.dequeue().key);
    }
}
