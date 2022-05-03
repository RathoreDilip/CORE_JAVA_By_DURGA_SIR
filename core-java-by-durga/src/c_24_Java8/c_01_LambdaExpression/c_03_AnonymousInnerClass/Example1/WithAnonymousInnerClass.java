package c_24_Java8.c_01_LambdaExpression.c_03_AnonymousInnerClass.Example1;

public class WithAnonymousInnerClass {
    public static void main(String[] args) {
        // Anonymous Inner Class
        Runnable r=new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("Child Thread.. :"+i);
                }
            }
        };
        Thread t=new Thread(r);
        t.start();

        for (int i = 0; i < 10; i++) {
            System.out.println("Main Thread.. :"+i);
        }
    }
}
