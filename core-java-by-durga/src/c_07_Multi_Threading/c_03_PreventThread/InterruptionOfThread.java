package c_07_Multi_Threading.c_03_PreventThread;

class MyThread2 extends Thread {
    @Override
    public void run() {
        try {
            for (int i = 0; i < 1000; i++) {
                System.out.println("Lazy methods..");
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("I got interrupted..");
        }
    }
}

public class InterruptionOfThread {
    public static void main(String[] args) {
        MyThread2 t = new MyThread2();
        t.start();
        t.interrupt();
        System.out.println("End of main..");
    }
}
