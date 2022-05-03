package c_09_Inner_Class.c_01_GFG.c_04_AnonymousClasses;

// Way 2: As an implementer of the specified interface
interface Hello{
    void show();
}

public class AnonymousInnerClassDemo2 {
    static Hello h=new Hello() {
        @Override
        public void show() {
            System.out.println("i am in AnonymousInnerClassDemo2 class..");
        }
    };

    public static void main(String[] args) {
        h.show();
    }
}
