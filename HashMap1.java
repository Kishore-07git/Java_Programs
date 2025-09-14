import java.util.*;
public class HashMap1 
{
    public static void main(String[] args) 
    {
        // Creating a HashMap to store employee ID and Name
        HashMap<Integer, String> employees = new HashMap<>();        
        // Adding employees to the HashMap
        employees.put(103, "Alice");
        employees.put(101, "Bob");
        employees.put(104, "Charlie");
        employees.put(102, "David");
        
        // Sorting the HashMap by Employee ID
        List<Map.Entry<Integer, String>> entryList = new ArrayList<>(employees.entrySet());
        
        entryList.sort(Map.Entry.comparingByKey());
        
        // Printing sorted employee details
        System.out.println("Employee ID | Employee Name");
        System.out.println("----------------------------");
        for (Map.Entry<Integer, String> entry : entryList) 
        {
            System.out.println(entry.getKey() + "          | " + entry.getValue());
        }
    }
}