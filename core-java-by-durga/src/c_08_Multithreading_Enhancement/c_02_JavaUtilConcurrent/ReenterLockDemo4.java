package c_08_Multithreading_Enhancement.c_02_JavaUtilConcurrent;

import java.util.concurrent.locks.ReentrantLock;

class MyThread2 extends Thread {
    static ReentrantLock l = new ReentrantLock();

    MyThread2(String name) {
        super(name);
    }

    @Override
    public void run() {

        do {
            try {
                if (l.tryLock()) {
                    System.out.println(Thread.currentThread().getName() + " -- Got locked..");
                    Thread.sleep(30000);
                    l.unlock();
                    System.out.println(Thread.currentThread().getName() + " -- releases locked..");
                    break;
                } else {
                    System.out.println(Thread.currentThread().getName() + " -- Unable to get lock and will try lock..");
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } while (true);


    }
}

public class ReenterLockDemo4 {
    public static void main(String[] args) {
        MyThread2 t1 = new MyThread2("FirstGroup");
        MyThread2 t2 = new MyThread2("SecondGroup");
        t1.start();
        t2.start();
    }
}
