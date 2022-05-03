package c_09_Inner_Class.c_01_GFG.c_01_NestedInnerClass;

class Outer{
    class Inner{
        public void show(){
            System.out.println("In a nested Inner class...");
        }
    }
}

public class NestedInnerClassDemo {
    public static void main(String[] args) {
        Outer.Inner in=new Outer().new Inner();
        in.show();
    }
}
