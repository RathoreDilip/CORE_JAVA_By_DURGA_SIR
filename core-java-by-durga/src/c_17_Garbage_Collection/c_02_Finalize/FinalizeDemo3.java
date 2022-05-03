package c_17_Garbage_Collection.c_02_Finalize;

// garbage collection calls finalize method only once for particular object.

public class FinalizeDemo3 {
    static FinalizeDemo3 s;
    public static void main(String[] args) throws InterruptedException {
        FinalizeDemo3 f=new FinalizeDemo3();
        System.out.println(f.hashCode());
        f=null;
        System.gc();
        Thread.sleep(5000);
        System.out.println(s.hashCode());
        s=null;
        System.gc();
        Thread.sleep(10000);
        System.out.println("End of main..");
    }

    @Override
    public void finalize() {
        System.out.println("Finalize method called..");
        s=this;
    }
}
