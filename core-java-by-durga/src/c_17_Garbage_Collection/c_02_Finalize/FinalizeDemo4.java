package c_17_Garbage_Collection.c_02_Finalize;

public class FinalizeDemo4 {
    static int count=0;
    public static void main(String[] args) {
        for (int i = 0; i < 1000000; i++) {
            FinalizeDemo4 f=new FinalizeDemo4();
            f=null;
        }
    }

    @Override
    public void finalize() {
        System.out.println("Finalize method called.."+ ++count);
    }
}
