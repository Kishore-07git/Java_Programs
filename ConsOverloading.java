import java.util.Scanner;
//Constructor Overloading
class Student
{
    String name;
    short pin;
    byte age;
    Student(String n,short p,byte a)
    {
        name=n;
        pin=p;
        age=a;
    }
    void print()
    {
        System.out.println(name + "\n" + age + "\n" + pin);
    }
}
class ConsOverloading
{
    public static void main(String args[])
    {
        System.out.println("Student Info:");
        Student std=new Student("kk",(short)07,(byte)18);
        std.print();
    }
}