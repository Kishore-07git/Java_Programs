import java.util.Scanner;
//Method Overloading 
class Area 
{
    double print(double r)
    {
        float PI=3.14f;
        return PI * r * r; 
    }
    int print(int l, int b)
    {
        return l * b; 
    }
    double print(double base,double height)
    {
        return 0.5 * base * height; 
    }
}
class MethodOverloading
{
    public static void main(String[] args) 
    {
        Area ar= new Area();
        System.out.println("Area of Circle= "+ar.print(7));
        System.out.println("Area of Rectangle= "+ar.print(7,3));
        System.out.println("Area of Triangle= "+ar.print(2.0d,7.0d));
    }
}