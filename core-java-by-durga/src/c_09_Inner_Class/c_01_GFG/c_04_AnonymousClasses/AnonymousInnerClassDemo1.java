package c_09_Inner_Class.c_01_GFG.c_04_AnonymousClasses;

// Way 1: As a subclass of the specified type
class Demo{
    void show(){
        System.out.println("i am in show method of super class..");
    }
}
public class AnonymousInnerClassDemo1 {

    static Demo d=new Demo(){
        @Override
        void show() {
            super.show();
            System.out.println("i am in AnonymousInnerClassDemo1 class");
        }
    };

    public static void main(String[] args) {
        d.show();
    }
}
