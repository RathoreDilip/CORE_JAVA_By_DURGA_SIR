package c_24_Java8.c_01_LambdaExpression.c_01_FunctionalInterface.Example1;

interface Interf{
    public void m1();
}

class Test implements Interf {
    @Override
    public void m1() {
        System.out.println("Without Lambda Expression m1() implementation..");
    }
}

public class WithoutLambdaExpressionDemo1 {
    public static void main(String[] args) {
        Interf i=new Test();
        i.m1();
    }
}
