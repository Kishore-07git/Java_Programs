package studentutil;
public class StudentDetails
{
    String name;
    int pin;
    String branch;
    public StudentDetails(String n,int p, String b)
    {
        name=n;pin=p; branch=b;
    }
    public void print()
    {
        System.out.println("Name: " + name + "\nPin: " + pin + "\nBranch: " + branch);
    }
}