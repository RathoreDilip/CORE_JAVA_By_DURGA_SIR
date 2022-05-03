package c_24_Java8.c_04_MethodAndConstructorReferenceByUsingOperator.c_01_MethodReference.Example2;

public class MethodReferenceLambdaExpressionDemo {
    public static void main(String[] args) {
        Runnable r=()->{
                            for (int i = 0; i < 10; i++) {
                                System.out.println("Child Thread.."+i);
                            }
                       };
        Thread t=new Thread(r);
        t.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("Main Thread.."+i);
        }
    }
}
