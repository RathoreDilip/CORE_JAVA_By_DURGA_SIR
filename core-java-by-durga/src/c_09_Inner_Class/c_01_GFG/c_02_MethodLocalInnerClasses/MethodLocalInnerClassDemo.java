package c_09_Inner_Class.c_01_GFG.c_02_MethodLocalInnerClasses;

class Outer{
    void outerMethod(){
        System.out.println("inside outer method..");
        class Inner{
            void innerMethod(){
                System.out.println("inside inner method..");
            }
        }
        Inner in=new Inner();
        in.innerMethod();
    }
}
public class MethodLocalInnerClassDemo {
    public static void main(String[] args) {
        Outer outer=new Outer();
        outer.outerMethod();
    }
}
