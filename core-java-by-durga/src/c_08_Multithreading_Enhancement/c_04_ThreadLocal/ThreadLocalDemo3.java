package c_08_Multithreading_Enhancement.c_04_ThreadLocal;

import c_04_Declarations_And_Access_Modifiers.pack2.C;

class CustomerThread extends Thread{
    static Integer custId=0;

    CustomerThread(String name){
        super(name);
    }

    private static ThreadLocal t1=new ThreadLocal(){
        @Override
        protected Object initialValue() {
            return ++custId;
        }
    };

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" executing with customer id : "+t1.get());
    }
}
public class ThreadLocalDemo3 {
    public static void main(String[] args) {
        CustomerThread c1=new CustomerThread("Customer thread-1");
        CustomerThread c2=new CustomerThread("Customer thread-2");
        CustomerThread c3=new CustomerThread("Customer thread-3");
        CustomerThread c4=new CustomerThread("Customer thread-4");
        c1.start();
        c2.start();
        c3.start();
        c4.start();
    }
}
