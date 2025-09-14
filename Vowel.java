import java.util.Scanner;

class Vowel
{
    public static void main(String args[])
    {
        char v;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a character:");
        v=sc.next().charAt(0);
        if(Character.isLetter(v))
        {
        switch(v)
        {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':System.out.print(v+ " is Vowel");break;            
            default:System.out.print(v+ " is Consonent");
        }
        }
        else
        System.out.println(v+ " is Invalid character");
    }
}