import java.util.Scanner;
class Array1
{
    public static void main (String args[])
    {
        int arr[]=new int[5],i,j;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array elements:");
        for(i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Reversed array:");
        for(i=arr.length-1;i>=0;i--)
        {
            System.out.println(arr[i]);
        }
        System.out.println("Sorted array:");
        for(i=0;i<arr.length;i++)
        {
            for(j=i+1;j<arr.length;j++)
            {
                if(arr[i]>arr[j])
                {
                    int store=arr[j];
                    arr[j]=arr[i];
                    arr[i]=store;
                }
            }
            System.out.println(arr[i]);
        }
    }
}