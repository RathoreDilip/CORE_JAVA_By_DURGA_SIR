package c_24_Java8.c_01_LambdaExpression.c_01_FunctionalInterface.Example3;

interface Interf{
    public int getLength(String s);
}

class Test implements Interf {

    @Override
    public int getLength(String s) {
        return s.length();
    }
}

public class WithoutLambdaExpressionDemo3 {
    public static void main(String[] args) {
        Interf i=new Test();
        System.out.println(i.getLength("Hello"));
        System.out.println(i.getLength("Without lambda expression"));
    }
}
