package c_07_Multi_Threading.c_03_PreventThread;

// If a thread wants to wait until completing some other thread then we should go for join() method.

class MyThread1 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i <=10 ; i++) {
            System.out.println("sita thread.."+i);
            try {
                Thread.sleep(100);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}

public class JoinMethodDemo {
    public static void main(String[] args) throws InterruptedException {
        MyThread1 t1=new MyThread1();
        t1.start();
        t1.join();

        for (int i = 0; i <=10 ; i++) {
            System.out.println("rama thread.."+i);
        }
    }
}
