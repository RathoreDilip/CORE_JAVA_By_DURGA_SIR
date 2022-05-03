package c_09_Inner_Class.c_01_GFG.c_02_MethodLocalInnerClasses;

class OuterClass {
    void outerMethod() {
        int x = 98;
        class InnerClass {
            void innerMethod() {
                System.out.println("x = " + x);
            }
        }
        InnerClass inner = new InnerClass();
        inner.innerMethod();
    }
}

public class MethodLocalVariableDemo {
    public static void main(String[] args) {
        OuterClass outer=new OuterClass();
        outer.outerMethod();
    }
}
