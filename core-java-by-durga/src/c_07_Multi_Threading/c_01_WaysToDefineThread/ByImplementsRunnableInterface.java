package c_07_Multi_Threading.c_01_WaysToDefineThread;

class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i <=10 ; i++) {
            System.out.println("child thread..."+i);
        }
    }
}

public class ByImplementsRunnableInterface {
    public static void main(String[] args) {
        MyRunnable r=new MyRunnable();
        Thread t=new Thread(r);
        t.start();

        for (int i = 0; i <=10 ; i++) {
            System.out.println("main thread..."+i);
        }
    }
}
