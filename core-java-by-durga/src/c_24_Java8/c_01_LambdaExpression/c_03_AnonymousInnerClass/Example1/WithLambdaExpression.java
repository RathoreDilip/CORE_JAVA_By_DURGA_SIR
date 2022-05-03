package c_24_Java8.c_01_LambdaExpression.c_03_AnonymousInnerClass.Example1;

public class WithLambdaExpression {
    public static void main(String[] args) {
        Runnable r=()->{
                            for (int i = 0; i < 10; i++) {
                                System.out.println("Child Thread.. :"+i);
                            }
                       };
        Thread t=new Thread(r);
        t.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("Main Thread.. :"+i);
        }
    }
}
