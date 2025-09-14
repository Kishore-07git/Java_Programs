//To Arrange array of strings in Ascending order
import java.util.Scanner;  
class AscendingString
{  
   public static void main(String args[])   
   {  
      int i,j;
      String arr[] = {"java","python","oops","js","cpp"};  
      int lang = arr.length;    
      for(i = 0; i<lang-1; i++)   
      {  
        for (j = i+1; j<arr.length; j++)   
        {   
            if(arr[i].compareTo(arr[j])>0)   
            {  
				String store = arr[i];  
				arr[i] = arr[j];  
				arr[j] = store;  
            }  
        } 
     }   
     for(i=0;i<lang;i++)
	 {
		System.out.println(arr[i]); 
	 } 
  }  
}