package c_17_Garbage_Collection.c_02_Finalize;

// finalize method call depends on object(which class object that class finalize method call.)
public class FinalizeDemo1 {

    @Override
    public void finalize() {
        System.out.println("FinalizeDemo1 class finalize method called..");
    }

    public static void main(String[] args) {
       // String s=new String("durga");
        FinalizeDemo1 s=new FinalizeDemo1();
        s=null;
        System.gc();
        System.out.println("End of main..");
    }

}
