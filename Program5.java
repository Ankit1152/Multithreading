class MultiThreading extends Thread{
    public void run(){
        try {
            System.out.println("Thread "+Thread.currentThread().getId()+" is running....");
        } catch (Exception e) {
            System.out.println("Exception is caught");
        }
    }
}
public class Program5 {
    public static void main(String[] args) {
        int n = 8;
        for(int i=0; i<n; i++){
            MultiThreading mt = new MultiThreading();
            mt.start();
        }
    }
}
