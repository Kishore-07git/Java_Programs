import java.util.Scanner;

class PrimeOrNot
{
    public static void main(String args[])
    {
        int m,a=0,n;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Number:");
        n=sc.nextInt();
        for(m=2;m<=n/2;m++)
        {
            if(n%m==0)
            a++;
        }
        if(a==0)
        System.out.print(n+ " is a prime number");
        else
        System.out.print(n+ " is not a prime number");
    }
}