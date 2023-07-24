public class Program3 {
    public static void main(String[] args) {
        // Creating an object of the thread class using the Thread constructor(String str)
        Thread t3 = new Thread("My first thread");
        // The start() moves the thread to the active state, runnable
        t3.start();

        String str = t3.getName();
        System.out.println(str);
    }
}
