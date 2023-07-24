// ThreadJoin class is the child class of the Thread class
class ThreadJoin extends Thread{
    // Overriding the run Method
    public void run(){
        for(int j=0; j<2; j++){
            try {
                // Sleeping the thread for 300ms
                Thread.sleep(300);
                System.out.println("The current thread name is "+Thread.currentThread().getName());
            } catch (Exception e) {
                System.out.println("The exception has been caught "+e);
            }
            System.out.println(j);
        }
    }
}
public class Main_class3 {
    public static void main(String[] args) {
        // Creating the three threads
        ThreadJoin th1 = new ThreadJoin();
        ThreadJoin th2 = new ThreadJoin();
        ThreadJoin th3 = new ThreadJoin();
        th1.start();

        // Started the second thread after when the first thread th1 has ended or died
        try {
            System.out.println("The current thread name is "+Thread.currentThread().getName());
            th1.join();
        } catch (Exception e) {
            System.out.println("The exception has been caught "+e);

            // Starting the thread th2
            th2.start();

            // Starting the th3 thread after when the thread th2 has ended or died
            try {
                System.out.println("The current thread name is "+Thread.currentThread().getName());
                th2.join();
            } catch (Exception e1) {
                System.out.println("The exception has been caught "+e1);
            }

            // Thread th3 start
            th3.start();
        }
    }
}
