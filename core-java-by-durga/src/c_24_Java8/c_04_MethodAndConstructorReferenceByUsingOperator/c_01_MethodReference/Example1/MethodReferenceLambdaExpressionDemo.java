package c_24_Java8.c_04_MethodAndConstructorReferenceByUsingOperator.c_01_MethodReference.Example1;

interface Interf{
    public void m1();
}

public class MethodReferenceLambdaExpressionDemo {
    public static void main(String[] args) {
        Interf i=()->{
                        System.out.println("lambda Implementation");
                     };
        i.m1();
    }
}
