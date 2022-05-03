package c_08_Multithreading_Enhancement.c_01_ThreadGroup;

class MyThread extends Thread{

    public MyThread(ThreadGroup g,String name) {
        super(g,name);
    }

    @Override
    public void run() {
        System.out.println("child Thread..");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
public class ThreadGroupDemo2 {
    public static void main(String[] args) {
        ThreadGroup pg=new ThreadGroup("parentGroup");
        ThreadGroup cg=new ThreadGroup(pg,"childGroup");

        MyThread t1=new MyThread(pg,"childThread1");
        MyThread t2=new MyThread(pg,"childThread2");
        t1.start();
        t2.start();

        System.out.println(pg.activeCount()); // 2
        System.out.println(pg.activeGroupCount()); // 1
        pg.list();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(pg.activeCount()); // 0
        System.out.println(pg.activeGroupCount()); // 1
        pg.list();
    }
}
