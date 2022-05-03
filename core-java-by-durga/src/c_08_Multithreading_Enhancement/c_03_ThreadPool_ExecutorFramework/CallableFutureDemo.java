package c_08_Multithreading_Enhancement.c_03_ThreadPool_ExecutorFramework;

import java.util.concurrent.*;

class MyCallable implements Callable{

    int num;
    MyCallable(int num){
        this.num=num;
    }
    @Override
    public Object call() throws Exception {
        System.out.println(Thread.currentThread().getName()+" is responsible to find sum of first "+num+" numbers..");
        int sum=0;
        for (int i =1; i <=num ; i++) {
            sum+=i;
        }
        return sum;
    }
}
public class CallableFutureDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        MyCallable[] jobs={new MyCallable(4),new MyCallable(5),
                           new MyCallable(6),new MyCallable(8),new MyCallable(10)};
        ExecutorService service= Executors.newFixedThreadPool(3);
        for (MyCallable job: jobs) {
            Future f=service.submit(job);
            System.out.println(f.get());
        }
        service.shutdown();
    }
}
