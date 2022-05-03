package c_07_Multi_Threading.c_03_PreventThread;

class MyThread3 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i <=10000 ; i++) {
            System.out.println("I am lazy thread..:"+i);
        }
        System.out.println("I am entering into sleeping state...");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            System.out.println("I got interrupted..");
        }
    }
}
public class InterruptionOfThread2 {
    public static void main(String[] args) {
        MyThread3 t=new MyThread3();
        t.start();
        t.interrupt();
        System.out.println("End of main thread...");
    }
}
