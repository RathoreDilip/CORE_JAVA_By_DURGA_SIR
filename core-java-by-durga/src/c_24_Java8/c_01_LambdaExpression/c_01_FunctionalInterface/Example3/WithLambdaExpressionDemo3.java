package c_24_Java8.c_01_LambdaExpression.c_01_FunctionalInterface.Example3;

@FunctionalInterface
interface Interf1{
    public int getLength(String s);
}

public class WithLambdaExpressionDemo3 {
    public static void main(String[] args) {
        Interf1 i= s -> s.length();
        System.out.println(i.getLength("Hello"));
        System.out.println(i.getLength("With Lambda expression"));
    }
}
