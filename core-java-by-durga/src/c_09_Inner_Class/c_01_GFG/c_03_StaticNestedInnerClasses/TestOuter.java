package c_09_Inner_Class.c_01_GFG.c_03_StaticNestedInnerClasses;

public class TestOuter {
    static int data=30;
    static class Inner{
        void msg(){
            System.out.println("data :: "+data);
        }
    }

    public static void main(String[] args) {
        TestOuter.Inner obj=new TestOuter.Inner();
        obj.msg();
    }
}
