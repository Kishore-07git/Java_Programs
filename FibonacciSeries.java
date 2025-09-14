import java.util.Scanner;

class FibonacciSeries
{
    public static void main(String args[])
    {
        int i,j=1,k=0,m;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n Value:");
        i=sc.nextInt();
        System.out.println("Fibonacci Series:");
        do
        {
            System.out.println(k);
            m=j+k;
            j=k;
            k=m;
            i--;
        }
        while(i!=0);
    }
}