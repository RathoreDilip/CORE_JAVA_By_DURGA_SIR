package c_05_OOPs_Object_Oriented_Programming;

class P{
    public static void m1(){
        System.out.println("Parent class Static m1() method...");
    }
}
class C extends P{
    public static void m1(){
        System.out.println("Child class Static m1() method...");
    }
}
public class MethodHidingDemo {
    public static void main(String[] args) {
        P p=new P();
        p.m1();
        C c=new C();
        c.m1();
        P p1=new C();
        p1.m1();
    }
}
