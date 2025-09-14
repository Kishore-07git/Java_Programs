import java.util.*;
class LinkedlistSorting 
{
    public static void main(String[] args) 
    {
        // Creating a LinkedList using the List interface
        List<Integer> list = new LinkedList<>();

        // Adding elements to the LinkedList
        list.add(07);
        list.add(45);
        list.add(17);
        list.add(33);
        list.add(18);

        // Displaying the original list
        System.out.println("Original List: " + list);

        // Sorting the LinkedList
        Collections.sort(list);

        // Displaying the sorted list
        System.out.println("Sorted List: " + list);
    }
}