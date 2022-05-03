package c_07_Multi_Threading.c_01_WaysToDefineThread;

class MyThread extends Thread{
    // executing child thread
    @Override
    public void run() {
        for (int i = 0; i <=10 ; i++) {
            System.out.println("child Thread.."+i);
        }
    }
}

public class ByExtendingThread {
    public static void main(String[] args) {
        MyThread t=new MyThread();
        t.start();

        // executing main thread
        for (int i = 0; i <= 10; i++) {
            System.out.println("Main Thread.."+i);
        }
    }
}
