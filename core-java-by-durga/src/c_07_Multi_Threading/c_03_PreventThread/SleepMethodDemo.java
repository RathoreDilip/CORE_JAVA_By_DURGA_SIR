package c_07_Multi_Threading.c_03_PreventThread;

// if a thread don't want to perform any operation for a particular amount of time ()
public class SleepMethodDemo {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Durga");
        Thread.sleep(500);
        System.out.println("Software");
        Thread.sleep(500);
        System.out.println("Solution");
    }
}
