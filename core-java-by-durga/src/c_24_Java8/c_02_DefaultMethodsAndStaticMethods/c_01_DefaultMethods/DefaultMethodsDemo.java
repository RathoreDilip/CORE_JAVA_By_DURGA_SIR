package c_24_Java8.c_02_DefaultMethodsAndStaticMethods.c_01_DefaultMethods;

interface Interf{
    default void m1(){
        System.out.println("Default method..");
    }
}
public class DefaultMethodsDemo implements Interf {

    @Override
    public void m1() {
        System.out.println("My own implementation method..");
    }

    public static void main(String[] args) {
        DefaultMethodsDemo d=new DefaultMethodsDemo();
        d.m1();
    }
}
