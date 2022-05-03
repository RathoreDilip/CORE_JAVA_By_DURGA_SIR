package c_01_Language_Fundamental;

public class AnnonymousArray {
    public static void main(String[] args) {
        sum(new int[]{10,20,30,40});
    }

    private static void sum(int[] arr) {
        int total=0;
        for (int a:arr) {
            total=total+a;
        }
        System.out.println("The Total sum :: "+total);
    }
}
