package c_07_Multi_Threading.c_04_Synchronization;

class Display1{
    public  void wish(String name){
        synchronized(this){
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
}

class MyThread1 extends Thread{
    Display1 d;
    String name;
    MyThread1(Display1 d,String name){
        this.d=d;
        this.name=name;
    }

    @Override
    public void run() {
        d.wish(name);
    }
}

public class SychronizeBlockDemo {
    public static void main(String[] args) {
        Display1 d1=new Display1();
        // Display d2=new Display();
        MyThread1 t1=new MyThread1(d1,"Dhoni");
        MyThread1 t2=new MyThread1(d1,"Yuvraj");
        t1.start();
        t2.start();
    }

}
