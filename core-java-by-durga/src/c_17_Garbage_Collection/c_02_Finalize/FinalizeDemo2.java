package c_17_Garbage_Collection.c_02_Finalize;

// programmer can call finalize method as normal method
public class FinalizeDemo2 {
    public static void main(String[] args) {
        FinalizeDemo2 f=new FinalizeDemo2();
        f.finalize();
        f.finalize();
        f=null;
        System.gc();
        System.out.println("End of main..");
    }

    @Override
    public void finalize() {
        System.out.println("Finalize Method Called..");
    }
}
