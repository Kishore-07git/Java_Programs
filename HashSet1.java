import java.util.*;
class HashSet1
{
    public static void main(String args[])
    {
        HashSet<String> set=new HashSet<String>();
        System.out.println(set);
        System.out.println("Remove element is: " + set.remove("1"));
        System.out.println(set.add("16"));
        System.out.println(set.add("16"));
        set.add("null");
        set.add("41");
        set.add("79");
        set.add("85");
        set.add("90");
        Iterator<String> i=set.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }
        System.out.println("Size of the HashSet is: " + set.size());
        List<String> coun=new LinkedList<>();
        coun.add("India");
        coun.add("USA");
        coun.add("UK");
        HashSet<String> set2=new HashSet<String>(coun);
        Iterator<String> itr=set2.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
        System.out.println("Size of the HashSet is: " + set2.size());
    }
}