public class NamingThread extends Thread {
    public void run(){
        System.out.println("Running the thread");
    }
    public static void main(String[] args) {
        NamingThread t1 = new NamingThread();
        NamingThread t2 = new NamingThread();

        System.out.println("The name of the t1 is "+t1.getName());
        System.out.println("The name of the t2 is "+t2.getName());

        t1.start();
        t2.start();

        t1.setName("Ankit ka thread");
        System.out.println("After changing the name of t1 is "+t1.getName());
    }
}
