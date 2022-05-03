package c_01_Language_Fundamental;

public class VarArgMethodDemo {
    public static void sum(int... x){
        int total=0;
        for (int t:x) {
            total=total+t;
        }
        System.out.println("The Total sum :: "+total);
    }
    public final strictfp static void main(String[] args) {
        sum();
        sum(10);
        sum(10,20);
        sum(10,20,30);
    }
}
