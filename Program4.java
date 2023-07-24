public class Program4 implements Runnable {
    public void run(){
        System.out.println("Now the thread is running");
    }
    public static void main(String[] args) {
        // Creating an object of class Program4 or Main class
        Runnable r1 = new Program4();

        // Creating an object of the class Thread using Thread (Runnable r, String str) 
        Thread th = new Thread(r1,"My new Thread");
        // The start() moves the thread to the active state
        th.start();

        String str = th.getName();
        System.out.println(str);
    }
}
