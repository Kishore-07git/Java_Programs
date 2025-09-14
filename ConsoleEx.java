import java.io.*;
class ConsoleEx
{
    public static void main(String args[])
    {
         Console con=System.console();
         char[] password;
         String uname;
         if(con!=null)
                 System.out.println("Enter User Name: ");
                 uname=con.readLine();
                 System.out.println("Enter Password: ");
                 password=con.readPassword();
                 System.out.println("User Name: " + uname + "\nPassword: ");
                 for(char c : password)
                          System.out.println(c);
     }
}