class ExcptnHandExm
{
    static int raw(int x, int y)throws ArithmeticException
    {
        if(y==0)
        {
            throw new ArithmeticException("cannot divide by zero");
        }
        return 0;
    }
    public static void main(String args[])
    {
        try
        {
            int res=raw(7,0);
            System.out.println("Result:" + res);
        } 
        catch(ArithmeticException e)
        {
            System.out.println("Exception caught:" + e.getMessage());
        }
        finally
        {
            System.out.println("Handled Exception Successfully");
        }
    }
}