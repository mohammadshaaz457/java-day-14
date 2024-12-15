class MyRunnable implements Runnable {
    private String name;
    
    public MyRunnable(String name) {
        this.name = name;
    }
    public void run() {
        System.out.println(name + " is running.");
        try {
            Thread.sleep(1000);  
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(name + " finished.");
    }
}

public class multithread {
    public static void main(String[] args) {
        MyRunnable task1 = new MyRunnable("Thread 1");
        MyRunnable task2 = new MyRunnable("Thread 2");

        Thread thread1 = new Thread(task1);
        Thread thread2 = new Thread(task2);

        thread1.start();
        thread2.start();
    }
}
