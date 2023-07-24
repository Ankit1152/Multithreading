public class Main_class2 extends Thread {
    public void run(){
        try {
            for(int i=1; i<5; i++){
                Thread.sleep(500);
                System.out.println(i);
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        
    }
    public static void main(String[] args) {
        Main_class2 m1 = new Main_class2();
        Main_class2 m2 = new Main_class2();

        m1.run();
        m2.run();

    }
}
