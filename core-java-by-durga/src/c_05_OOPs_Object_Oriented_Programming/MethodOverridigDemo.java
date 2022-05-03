package c_05_OOPs_Object_Oriented_Programming;

class Parent{
    public void m1(){
        System.out.println("Parent class Static m1() method...");
    }

}
class Child extends Parent{
    public void m1(){
        System.out.println("Child class Static m1() method...");
    }

}
public class MethodOverridigDemo {
    public static void main(String[] args) {
        Parent p=new Parent();
        p.m1();
        Child c=new Child();
        c.m1();
        Parent p1=new Child();
        p1.m1();
    }
}
