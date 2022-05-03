package c_24_Java8.c_01_LambdaExpression.c_01_FunctionalInterface.Example1;

@FunctionalInterface
interface Interf1{
    public void m1();
}

public class WithLambdaExpressionDemo1 {
    public static void main(String[] args) {
        Interf1 i=()-> System.out.println("With Lambda Expression m1() implementation..");
        i.m1();
    }
}
