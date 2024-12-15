class MyRunnable implements Runnable
{
    public void run()
    {
        System.out.println("Thread is running");

    }
}
public class threadimplements
{
    public static void main(String[] args) {
        MyRunnable g=new MyRunnable();
        g.run();

        
    }
}