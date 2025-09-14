// Base class
class Person
{
    String name;
    int age;

    // Constructor for Student class
    Person(String n, int a)
    {
        name = n;
        age = a;
    }

    // Method to print student details
    void print()
    {
        System.out.println("Name: " + name+"\nAge: "+age);
    }
}

// Intermediate base class
class College extends Person 
{
    String cname,course;
    int sem;
    // Constructor for Marks class
    College(String n,int a,String cname,String course,int sem)
    {
        super(n,a); // Calling the constructor of the base class (Student)
        this.cname=cname;
        this.course=course;
        this.sem=sem;
    }
    void display() 
    {
        print();
        System.out.println("CollegeName: " + cname+"\nCourse: "+course+"\nSem: "+sem);
    }
}

// Derived class
class Student extends College
{
    int pin,marks;
    Student(String n, int a, String cname,String course,int sem,int p,int m)
    {
        super(n,a,cname,course,sem); 
        pin=p;
        marks=m;
    }
    void printstud() 
    {
        display();
        System.out.println("Pin: " + pin +"\nMarks: "+marks);
    }
}

// Main class
class MultilevelInheritance
{
    public static void main(String[] args) 
    {
        Student stud = new Student("kkk",18,"Govt Polytechnic","CME",4,007,777);
        stud.printstud();
    }
}