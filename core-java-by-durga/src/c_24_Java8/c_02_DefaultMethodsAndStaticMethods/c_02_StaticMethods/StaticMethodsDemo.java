package c_24_Java8.c_02_DefaultMethodsAndStaticMethods.c_02_StaticMethods;

interface Interf{
    // static methods allow in 1.8 version inside interface
    public static void m1(){
        System.out.println("Interface static methods..");
    }
}
public class StaticMethodsDemo implements Interf {
    public static void main(String[] args) {
        StaticMethodsDemo s=new StaticMethodsDemo();
        Interf.m1();
    }
}
