package c_24_Java8.c_01_LambdaExpression.c_01_FunctionalInterface.Example4;

class MyRunnable implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Child Thread.."+i);
        }
    }
}

public class WithoutLambdaExpressionDemo4 {
    public static void main(String[] args) {
        MyRunnable r=new MyRunnable();
        Thread t=new Thread(r);
        t.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("Main Thread.."+i);
        }
    }
}
