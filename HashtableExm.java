import java.util.*;
class HashtableExm 
{
    public static void main(String args[]) 
	{
        // Creating a Hashtable
        Hashtable<Integer, String> hm = new Hashtable<>();
        hm.put(1, "Akhil");
        hm.put(2, "Anil");
        hm.put(3, "Chandana");
        hm.put(5, "Harish");
        hm.put(7, "Kishore");
        // Searching for a key
        int searchKey = 3;
        if (hm.containsKey(searchKey))
        {
            System.out.println("Key " + searchKey + " found with value: " + hm.get(searchKey));
        } 
        else 
        {
            System.out.println("Key " + searchKey + " not found.");
        }

        // Searching for a value
        String searchValue = "Chandana";
        if (hm.containsValue(searchValue)) 
        {
            for (Map.Entry<Integer, String> entry : hm.entrySet()) 
            {
                if (entry.getValue().equals(searchValue)) 
                {
                    System.out.println("Value \"" + searchValue + "\" found with key: " + entry.getKey());
                    break;
                }
            }
        } 
        else 
        {
            System.out.println("Value \"" + searchValue + "\" not found.");
        }
    }
}