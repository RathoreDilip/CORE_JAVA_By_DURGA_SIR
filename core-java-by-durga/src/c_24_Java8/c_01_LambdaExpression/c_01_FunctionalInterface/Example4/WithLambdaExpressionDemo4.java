package c_24_Java8.c_01_LambdaExpression.c_01_FunctionalInterface.Example4;


public class WithLambdaExpressionDemo4 {
    public static void main(String[] args) {
        Runnable r=()->{
                            for (int i = 0; i <10 ; i++) {
                                System.out.println("Lambda Child Thread :: "+i);
                            }
                         };

        Thread t=new Thread(r);
        t.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("Lambda Main Thread :: "+i);
        }
    }
}
