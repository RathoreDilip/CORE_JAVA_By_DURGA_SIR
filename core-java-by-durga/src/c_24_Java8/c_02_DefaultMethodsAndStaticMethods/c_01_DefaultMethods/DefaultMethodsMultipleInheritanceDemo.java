package c_24_Java8.c_02_DefaultMethodsAndStaticMethods.c_01_DefaultMethods;

interface Left{
    default void m1(){
        System.out.println("Left Default Methods..");
    }
}
interface Right{
    default void m1(){
        System.out.println("Right Default Methods..");
    }
}
public class DefaultMethodsMultipleInheritanceDemo implements Left,Right {

    @Override
    public void m1() {
       // System.out.println("My own implementation..");
       //  Left.super.m1();
        Right.super.m1();
    }

    public static void main(String[] args) {
        DefaultMethodsMultipleInheritanceDemo i=new DefaultMethodsMultipleInheritanceDemo();
        i.m1();
    }
}
