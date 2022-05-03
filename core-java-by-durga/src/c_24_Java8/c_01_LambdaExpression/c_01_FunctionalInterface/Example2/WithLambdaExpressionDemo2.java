package c_24_Java8.c_01_LambdaExpression.c_01_FunctionalInterface.Example2;

@FunctionalInterface
interface Interf1{
    public void m1(int a, int b);
}

public class WithLambdaExpressionDemo2 {
    public static void main(String[] args) {
       Interf1 i=(a, b)->System.out.println("The sum of :: "+(a+b));
       i.m1(10,20);
       i.m1(100,200);
    }
}
