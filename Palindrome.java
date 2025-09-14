import java.util.Scanner;
class Palindrome
{
	public static void main(String args[])
	{
		int i,n,rem,sum=0;
		Scanner sn=new Scanner(System.in);
		System.out.print("Enter any Number:");
		i=sn.nextInt();
		n=i;
		while(n>0)
		{
			rem=n%10;
			sum=sum*10+rem;
			n=n/10;
		}
		   if(i==sum)
		      System.out.print(i+" is palindrome number");
	       else
		      System.out.print(i+" is not a palindrome number");
	}
}