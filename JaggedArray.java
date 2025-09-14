import java.util.Scanner;
class JaggedArray
{
    public static void main(String args[])
    {
        int arr[][]=new int[3][],i,j;
        arr[0]=new int[2];
        arr[1]=new int[4];
        arr[2]=new int[3];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array elements:");
        for(i=0;i<arr.length;i++)
        {
            for(j=0;j<arr[i].length;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("The Array is:");
        for(i=0;i<arr.length;i++)
        {
            for(j=0;j<arr[i].length;j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}