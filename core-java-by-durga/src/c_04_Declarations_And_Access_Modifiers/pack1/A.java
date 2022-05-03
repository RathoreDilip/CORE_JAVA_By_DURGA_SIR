package c_04_Declarations_And_Access_Modifiers.pack1;

public class A {
    protected void m1(){
        System.out.println("The most mis understand modifiers in java");
    }
}
class B extends A {
    public static void main(String[] args) {
        A a=new A();
        a.m1();

        B b=new B();
        b.m1();

        A a1=new B();
        a1.m1();
    }
}
