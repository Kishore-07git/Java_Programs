class ExctpnHandExm
{
    static int div(int x, int y)throws ArithmeticException
    {
        if(y==0)
        {
            throw new ArithmeticException("cannot divide by zero");
        }
    }
    public static void main(String args[])
    {
        try
        {
            int res=div(7,0);
            System.out.println("Result:" + res);
        } catch(ArithmeticException e){
            System.out.println("Exception caught:" + e.getMessage());
        }
        finally
        {
            System.out.println("Handled Exception Successfully");
        }
    }
}