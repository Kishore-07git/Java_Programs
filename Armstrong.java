import java.util.Scanner;
class Armstrong
{
	public static void main(String args[])
	{
		int i,n,rem,sum=0;
		Scanner sn=new Scanner(System.in);
		System.out.print("Enter any Number:");
		i=sn.nextInt();
		for(n=i;n>0;n=n/10)
		{
			rem=n%10;
			sum+=rem*rem*rem;
		}
		   if(i==sum)
		      System.out.print(i+" is armstrong number");
	       else
		      System.out.print(i+" is not a armstrong number");
	}
}