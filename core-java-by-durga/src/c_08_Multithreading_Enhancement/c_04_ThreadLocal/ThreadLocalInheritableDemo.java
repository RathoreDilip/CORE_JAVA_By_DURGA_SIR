package c_08_Multithreading_Enhancement.c_04_ThreadLocal;

class ParentThread extends Thread{
    public static InheritableThreadLocal t1=new InheritableThreadLocal(){
        @Override
        protected Object childValue(Object parentValue) {
            return "cc";
        }
    };

    @Override
    public void run() {
        t1.set("pp");
        System.out.println("Parent thread value -- :"+t1.get());
        ChildThread ct=new ChildThread();
        ct.start();
    }
}
class ChildThread extends Thread{
    @Override
    public void run() {
        System.out.println("Child  thread value -- :"+ParentThread.t1.get());
    }
}
public class ThreadLocalInheritableDemo {
    public static void main(String[] args) {
        ParentThread pt=new ParentThread();
        pt.start();
    }
}
