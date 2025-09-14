import java.util.*;
class Linkedlist
{
    public static void main(String args[])
    {
        LinkedList<String> ll=new LinkedList<>();
        System.out.println("Initial list:"+ll);
        ll.add("MMM");
        ll.add("BBB");
        System.out.println("\nadd(E e):"+ll);
        System.out.println("\nSize():"+ll.size());
        
        //adding an element at the specific position
        ll.add(1,"TTT");
        ll.add(3,"FFF");
        System.out.println("\nadd(int index,E element):"+ll);
        // System.out.println("\nget(int index):"+ll.get(1));
        System.out.println("\ngetFirst():"+ll.getFirst());
        System.out.println("\ngetLast():"+ll.getLast());
        // System.out.println("\npeek():"+ll.peek());
        System.out.println("\nremoveLast():"+ll.removeLast());
        System.out.println("\nAfter removing last element:"+ll);
    }
}