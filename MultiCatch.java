class MultiCatch
{
    public static void main(String[] args)
    {
        try
        {
            int result =7/0;
            int x[]={1,2,3};
            System.out.println(x[5]);
            String str=null;
            System.out.println(str.length());
        }
        catch(ArithmeticException e)
        {
            System.out.println(e.getMessage());
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e.getMessage());
        }
        catch(NullPointerException e)
        {
            System.out.println(e.getMessage());
        }
        finally
        {
            System.out.println("\n program continues after handle the current exception");
        }
    }
}