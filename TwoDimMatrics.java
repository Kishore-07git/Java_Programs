import java.util.Scanner;
class TwoDimMatrics
{
    public static void main(String args[])
    {
        int x[][]=new int[2][2],y[][]=new int[2][2],z[][]=new int[2][2];
        int i,j,k;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st array elements:");
        for(i=0;i<x.length;i++)
        {
            for(j=0;j<x[i].length;j++)
            {
                x[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter 2nd array elements:");
        for(i=0;i<y.length;i++)
        {
            for(j=0;j<y[i].length;j++)
            {
                y[i][j]=sc.nextInt();
            }
        }
        System.out.println("Addition:");
        for(i=0;i<z.length;i++)
        {
            for(j=0;j<z[i].length;j++)
            {
                z[i][j]=x[i][j]+y[i][j];
                System.out.print(z[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Subtration:");
        for(i=0;i<z.length;i++)
        {
            for(j=0;j<z[i].length;j++)
            {
                z[i][j]=x[i][j]-y[i][j];
                System.out.print(z[i][j] + " ");
            }
            System.out.println();
        }
         System.out.println("Multiplication:");
        for(i=0;i<z.length;i++)
        {
            for(j=0;j<z[i].length;j++)
            {
                z[i][j]=0;
                for(k=0;k<z[i].length;k++)
                {
                    z[i][j]+=x[i][k]*y[k][j];
                }
                System.out.print(z[i][j] + " ");
            }
            System.out.println();
        }
    }
}