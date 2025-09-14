import java.util.Scanner;
 
 class EvenOdd
{
    public static void main(String args[])
	{
		int m,i;
		Scanner sn=new Scanner(System.in);
		System.out.print("Enter n number:");
		m=sn.nextInt();
		System.out.println("Even numbers are:" + m);
		for(i=1;i<m;i++)
		{
			if(i%2==0)
				System.out.println(i);
		}
		System.out.println("Odd numbers are:" + m);
		for(i=1;i<m;i++)
		{
			if(i%2!=0)
				System.out.println(i);
		}
	}
}
		