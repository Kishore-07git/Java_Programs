class MultiTry
{
    public static void main(String[] args)
    {
        try
        {
            try
            {
                int result=7/0;
            }
            catch(ArithmeticException e)
            {
                System.out.println("\n" + e.getMessage());
            }
            int x[]={1,2,3};
            System.out.println( x[5]);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println( e.getMessage());
        }
        finally
        {
            System.out.println("\n program continues after handling exception");
        }
    }
}