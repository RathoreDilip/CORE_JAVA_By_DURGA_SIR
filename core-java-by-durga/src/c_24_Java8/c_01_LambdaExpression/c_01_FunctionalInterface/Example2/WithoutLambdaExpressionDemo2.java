package c_24_Java8.c_01_LambdaExpression.c_01_FunctionalInterface.Example2;

interface Interf{
    public void m1(int a, int b);
}

class Test implements Interf {

    @Override
    public void m1(int a, int b) {
        System.out.println("The sum of :: "+(a+b));
    }
}

public class WithoutLambdaExpressionDemo2 {
    public static void main(String[] args) {
        Interf i=new Test();
        i.m1(10,20);
        i.m1(100,200);
    }
}
