import java.lang.Thread;
public class Program7 {
    public static void main(String[] args) {
        try {
            for(int i=0; i<5; i++){
                // The Main thread sleeps for the 1000ms, which is 1 sec whenever the loop runs
                Thread.sleep(1000);
                System.out.println(i);
            }
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}
