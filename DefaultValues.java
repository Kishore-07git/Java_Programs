import java.util.Scanner;
class DefaultValues
{
    boolean m;
    byte n;
    short o;
    int p;
    long q;
    float r;
    double s;
    char t;
    public static void main(String args[])
    {
        System.out.println("Default values of Datatypes are :");
        DefaultValues ob=new DefaultValues();
        System.out.println("Boolean:" + ob.m);
        System.out.println("Byte:" + ob.n);
        System.out.println("Short:" + ob.o);
        System.out.println("Int:" + ob.p);
        System.out.println("Long:" + ob.q);
        System.out.println("Float:" + ob.r);
        System.out.println("Double:" + ob.s);
        System.out.println("Char:" + ob.t);
    }
}