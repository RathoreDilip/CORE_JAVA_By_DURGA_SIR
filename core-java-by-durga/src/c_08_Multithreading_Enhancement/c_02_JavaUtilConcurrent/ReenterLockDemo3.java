package c_08_Multithreading_Enhancement.c_02_JavaUtilConcurrent;

import java.util.concurrent.locks.ReentrantLock;

class MyThread1 extends Thread{
    static ReentrantLock l=new ReentrantLock();
    MyThread1(String name){
        super(name);
    }

    @Override
    public void run() {
        if(l.tryLock()){
            System.out.println(Thread.currentThread().getName()+" -- Got locked and performing safe operation..");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            l.unlock();
        }else {
            System.out.println(Thread.currentThread().getName()+" -- Unable to get lock hence performing alternative operations..");
        }
    }
}
public class ReenterLockDemo3 {
    public static void main(String[] args) {
        MyThread1 t1=new MyThread1("FirstGroup");
        MyThread1 t2=new MyThread1("SecondGroup");
        t1.start();
        t2.start();
    }
}
