//To print the reverse of a string,to find substring,convert a string from lowercase to uppercase
import java.util.Scanner;
class StringFunction   
{    
    public static void main(String[] args) 
	{    
        String str = "Java Programing";     
        String revStr = "";      
        //Iterate through the string from last and add each character to variable reversedStr    
        for(int i = str.length()-1; i>= 0; i--)
		{    
            revStr = revStr + str.charAt(i);    
        }       
        System.out.println("Original string: " + str);        
        System.out.println("Reverse of given string: " + revStr);

		//To Find Substring
		String str1 = "Oops Concepts"; 
		String substr = str1.substring(4);
        System.out.println("Substring: " + substr);
		
		//Converting a string from lowercase to uppercase
		String str2 = "hello world";
        System.out.println(str2.toUpperCase());
    }    
}