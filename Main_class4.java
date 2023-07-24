public class Main_class4 extends Thread{
    public void run(){
        for(int i=1; i<=5; i++){
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        Main_class4 t1 = new Main_class4();
        Main_class4 t2 = new Main_class4();
        Main_class4 t3 = new Main_class4();

        t1.start();

        try {
// Join() method when we are using, it makes sure that that thread should get completed then the other thread will start working
            t1.join();
        } catch (Exception e) {
            System.out.println(e);
        }

        t2.start();
        t3.start();
    }
}
