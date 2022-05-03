package c_07_Multi_Threading.c_03_PreventThread;

// To pause current thread and give chance to other same priority thread

class MyThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i <=10 ; i++) {
            Thread.yield(); // it is static method
            System.out.println("child thread..."+i);
        }
    }
}

public class YieldMethodDemo {
    public static void main(String[] args) {
        MyThread t=new MyThread();
        t.start();
        for (int i = 0; i <=10 ; i++) {
            System.out.println("main thread..."+i);
        }
    }
}
