package c_07_Multi_Threading.c_02_ThreadPriority;

class MyThread extends Thread{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getPriority());
        for (int i = 0; i <=10 ; i++) {
            System.out.println("child thread.."+i);
        }
    }
}
public class ThreadPriorityDemo {
    public static void main(String[] args) {
        MyThread t=new MyThread();
        t.setPriority(10);
        t.start();

        System.out.println(Thread.currentThread().getPriority());
        for (int i = 0; i <=10 ; i++) {
            System.out.println("main thread.."+i);
        }
    }
}
