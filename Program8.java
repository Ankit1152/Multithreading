public class Program8 extends Thread{

    public void run(){
        System.out.println("Running the thread");
    }
    public static void main(String[] args) {
        Program8 t1 = new Program8();
        t1.start();
        t1.start();   // Second times it gives an error because once the thread is start() it goes to dead state after execution
    }
}
