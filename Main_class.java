public class Main_class implements Runnable{
    public void run(){
        System.out.println("Running");
    }
    public static void main(String[] args) {
        Main_class m1 = new Main_class();

        Thread t1 = new Thread(m1);
        t1.start();
        t1.run();
        m1.run();
    }
}
