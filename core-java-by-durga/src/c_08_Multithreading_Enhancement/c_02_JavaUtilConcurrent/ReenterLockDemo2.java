package c_08_Multithreading_Enhancement.c_02_JavaUtilConcurrent;

import java.util.concurrent.locks.ReentrantLock;

class Display{
    ReentrantLock l=new ReentrantLock();
    public void wish(String name){
        l.lock();
        for (int i = 0; i < 10; i++) {
            System.out.println("Good morning..");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(name);
        }
        l.unlock();
    }
}
class MyThread extends Thread{
    Display d;
    String name;
    MyThread(Display d,String name){
        this.d=d;
        this.name=name;
    }

    @Override
    public void run() {
        d.wish(name);
    }
}
public class ReenterLockDemo2 {
    public static void main(String[] args) {
        Display d=new Display();
        MyThread t1=new MyThread(d,"Dhoni");
        MyThread t2=new MyThread(d,"Yuvraj");
        MyThread t3=new MyThread(d,"Rohit");
        t1.start();
        t2.start();
        t3.start();
    }
}
