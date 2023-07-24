public class Main_class5 extends Thread{

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
        Main_class5 t1 = new Main_class5();
        Main_class5 t2 = new Main_class5();
        Main_class5 t3 = new Main_class5();

        t1.start();

        try {
            t1.join(1500);
        } catch (Exception e) {
            System.out.println(e);
        }

        t2.start();
        t3.start();
    }
}
