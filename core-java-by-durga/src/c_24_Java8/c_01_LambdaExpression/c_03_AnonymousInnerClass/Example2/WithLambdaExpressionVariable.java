package c_24_Java8.c_01_LambdaExpression.c_03_AnonymousInnerClass.Example2;

interface Interf1{
    public void m1();
}
public class WithLambdaExpressionVariable {
    int x=10;
    public void m2(){
        int y=20;
        Interf1 i=()->{

                         //   int x=999;
                            System.out.println("this.x : "+this.x);  // referenced current class object
                         //   System.out.println("x : "+x); // referenced local variable
                            System.out.println("y : "+y);
                            x=888;
                        //    y=999;  // we can't change local variable inside lambda expression because by default it is final
                      };
        i.m1();
    }

    public static void main(String[] args) {
        WithLambdaExpressionVariable l=new WithLambdaExpressionVariable();
        l.m2();
    }
}
