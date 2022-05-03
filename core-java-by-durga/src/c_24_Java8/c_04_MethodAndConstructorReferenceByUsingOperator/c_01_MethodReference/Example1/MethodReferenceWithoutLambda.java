package c_24_Java8.c_04_MethodAndConstructorReferenceByUsingOperator.c_01_MethodReference.Example1;

interface Interf1{
    public void m1();
}

public class MethodReferenceWithoutLambda {
    public static void m2(){
        System.out.println("Method Reference...");
    }
    public static void main(String[] args) {
        Interf1 i= MethodReferenceWithoutLambda::m2;
        i.m1();
    }
}
