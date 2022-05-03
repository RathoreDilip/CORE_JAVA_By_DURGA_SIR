package c_07_Multi_Threading.c_04_Synchronization;

class Display{
    public synchronized void wish(String name){
        for (int i = 0; i <10 ; i++) {
            System.out.println("Good morning..");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(name);
        }
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

public class SynchronizedDemo {
    public static void main(String[] args) {
        Display d1=new Display();
       // Display d2=new Display();
        MyThread t1=new MyThread(d1,"Dhoni");
        MyThread t2=new MyThread(d1,"Yuvraj");
        t1.start();
        t2.start();
    }
}
