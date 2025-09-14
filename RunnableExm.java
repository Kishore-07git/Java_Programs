class MyThread implements Runnable 
{
    public void run()
    {
        System.out.println("Thread is in RUNNING state, executing run() method");
    }
}

public class RunnableExm 
{
    public static void main(String args[]) 
    {
        //create a new thread . this thread is in New state
        MyThread thread = new MyThread();
        Thread th = new Thread(thread);
        
        //check thread state
        System.out.println("Thread state before start: " + th.getState());
        
        //start the thread by calling start() method
        th.start();
        
        //check the current thread state after calling start()
        System.out.println("Thread state after start: " + th.getState());
    }
}