import java.util.*;
public class DequeueExm {
    public static void main(String[] args) {
        // Creating a Deque using LinkedList
        Deque<Integer> deque = new LinkedList<>();
        
        // Adding elements at the front end
        deque.addFirst(10);
        deque.addFirst(20);
        deque.addFirst(30);
        
        // Adding elements at the rear end
        deque.addLast(40);
        deque.addLast(50);
        deque.addLast(60);
        
        System.out.println("Deque after insertion: " + deque);
        
        // Removing elements from the front end
        deque.removeFirst();
        System.out.println("Deque after removing front element: " + deque);
        
        // Removing elements from the rear end
        deque.removeLast();
        System.out.println("Deque after removing rear element: " + deque);
        
        // Updating elements in the deque
        Iterator<Integer> iterator = deque.iterator();
        if (iterator.hasNext()) {
            deque.pollFirst(); // Remove first element
            deque.addFirst(100); // Add updated element at front
        }
        
        System.out.println("Deque after updating first element: " + deque);
    }
} 
