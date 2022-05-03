package c_04_Declarations_And_Access_Modifiers;

abstract class A{
    abstract public void m1();
    abstract public void m2();
    public void m3(){
        System.out.println("m3() abstract class method implementation....");
    }
}

public class AbstractMethodDemo extends A {

    @Override
    public void m1() {
        System.out.println("m1() implementation......");
    }

    @Override
    public void m2() {
        System.out.println("m2() implementation......");
    }

    public static void main(String[] args) {
        A a=new AbstractMethodDemo();
        a.m1();
        AbstractMethodDemo a2=new AbstractMethodDemo();
        a2.m2();
        a.m3();
    }
}
