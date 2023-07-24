public class Program6 extends Thread{
    public void run(){
        for(int i=1; i<5; i++){
            try {
                // The thread will sleep for the 500 ms
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        Program6 t1 = new Program6();
        Program6 t2 = new Program6();

        t1.start();
        t2.start();
    }
}
