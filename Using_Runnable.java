public class Using_Runnable implements Runnable {
    public void run(){
        System.out.println("Thread is running.....");
    }

    public static void main(String[] args) {
        Using_Runnable ur = new Using_Runnable();
        Thread t2 = new Thread(ur);     // Using the constructor Thread (Runnable r)
        t2.start();
    }
}
