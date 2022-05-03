package c_04_Declarations_And_Access_Modifiers.pack2;

import c_04_Declarations_And_Access_Modifiers.pack1.A;

public class C extends A {
    public static void main(String[] args) {
        A a=new A();
       // a.m1();

        C c=new C();
        c.m1();

        A a1=new C();
       // a1.m1();
    }
}
