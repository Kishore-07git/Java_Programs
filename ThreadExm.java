class A extends Thread
{
    public void run()
    {
        System.out.println("Thread A is running");
    }
}
class ThreadExm
{
    public static void main(String[] args)throws InterruptedException
    {
        A a=new A();
        a.start();
        a.join();
        System.out.println("Main Thread is running");
    }
}