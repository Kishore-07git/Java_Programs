import java.util.*;
class Array
{	
	public static void main(String args[])
 {
	int a[]=new int[10];
	int b[]=new int[10];
	int c[]=new int[10];
	int i,j,temp,n;
	Scanner sc=new Scanner(System.in);
	System.out.print("enter no of elements:");
	n=sc.nextInt();
	System.out.println("enter elements:");
	for(i=0;i<n;i++)
   {	
       a[i]=sc.nextInt();
	   b[i]=a[i];
	   c[i]=a[i];
   }
    System.out.println("reverse of a array");
        for(i=n-1;i>=0;i--)
        System.out.println(a[i]+"");
	    for(i=0;i<n;i++)
        {
	        for(j=i+1;j<n;j++)
            {
	            if(a[i]>a[j])
                {
	                temp=a[i];
	                a[i]=a[j];
	                a[j]=temp;
                }
            }
        }
    System.out.println("ascending order of array");
        for(i=0;i<=n-1;i++)
        System.out.println(a[i]+"");
        for(i=0;i<n;i++)
        {
	        for(j=i+1;j<n;j++)
            {
	            if(b[i]<b[j])
                {
	                temp=b[i];
	                b[i]=b[j];
	                b[j]=temp;
                }
            }
        }
    System.out.println("descending order of array");
    for(i=0;i<=n-1;i++)
    System.out.println(b[i]+"");
 }
}