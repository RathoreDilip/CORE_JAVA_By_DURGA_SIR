package c_10_Java_Lang_Package.c_06_AutoboxingAndAutoUnboxing;

class Test{
    public static void m1(Integer I) {
        System.out.println("autoboxing...");
    }

    public static void m1(int... i) {
        System.out.println("var-arg...");
    }
}
public class OverloadDemo {
    public static void m1(long l) {
        System.out.println("widening...");
    }

    public static void m1(Integer I) {
        System.out.println("autoboxing...");
    }

    public static void m1(int... i) {
        System.out.println("var-arg...");
    }

    public static void main(String[] args) {
        // widening dominate autoboxing
        // widening dominate var-arg
        int x=10;
        m1(x);  // widening...

        // autoboxing dominates var-arg
        Test.m1(x); // autoboxing...


    }
}
