package c_07_Multi_Threading.c_05_InterCommunicationThread;

class ThreadB extends Thread {
    int total=0;

    @Override
    public void run() {
        synchronized (this){
            System.out.println("child thread starts calculation..");
            for (int i = 0; i <=100 ; i++) {
                total=total+i;
            }
            System.out.println("child thread trying to give notifications...");
            this.notify();
        }
    }
}
public class InterThreadCommunicationDemo {
    public static void main(String[] args) throws InterruptedException {
        ThreadB b=new ThreadB();
        b.start();
        synchronized (b){
            System.out.println("main thread trying to call wait() method...");
            b.wait();
            System.out.println("main thread got notifications..");
            System.out.println(b.total);
        }
    }
}
