public class g {
    public static void main(String[] args) {
        Runnable r=()->System.err.println("i am new version of java 8"); 
        Thread t= new Thread(r);
        
            t.start();
            System.err.println(t.isAlive());
        
    }
    
}
