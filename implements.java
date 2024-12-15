
class TBA implements Runnable{
    int avt=5;
    public void run()
    {
        String name = Thread.currentThread().getName();
        synchronized(this)
        {
            System.out.println(name+" you are trying to get the book");
            if(avt>0)
            {
                try{
                    Thread.sleep(5000);
                }catch(InterruptedException e)
                {
                    System.out.println(name+" "+e);
                }
                avt--;
                System.out.println(name+" Your got your book");
            }else{
                System.out.println(name+" Sorry Go and ask librarian");
            }
        }
    }
}
public class Main1{
    public static void main(String args[])
    {
        TBA g = new TBA();
        Thread t1 = new Thread(g,"shaaz");
        Thread t2 = new Thread(g,"Satheesh");
        Thread t3 = new Thread(g,"Ashraf");
        Thread t4 = new Thread(g,"vivek");
        Thread t5 = new Thread(g,"prabas");
        Thread t6 = new Thread(g,"salaar");
        Thread t7 = new Thread(g,"shahid");
        Thread t8 = new Thread(g,"basha");
        Thread t9 = new Thread(g,"sahoo");
        Thread t10 = new Thread(g,"aejas");
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();
        t8.start();
        t9.start();
        t10.start();
    }
}
