package c_08_Multithreading_Enhancement.c_03_ThreadPool_ExecutorFramework;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class PrintJobs implements Runnable{
    String name;
    PrintJobs(String name){
        this.name=name;
    }

    @Override
    public void run() {
        System.out.println(name+"--- Job started by thread: "+Thread.currentThread().getName());
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(name+"--- Job completed by thread: "+Thread.currentThread().getName());

    }
}
public class ThreadPoolDemo {
    public static void main(String[] args) {
        PrintJobs[] jobs={new PrintJobs("durga"),new PrintJobs("Ravi"),new PrintJobs("Pavan"),
            new PrintJobs("Suresh"),new PrintJobs("Anil")};

        ExecutorService service= Executors.newFixedThreadPool(3);

        for (PrintJobs job:jobs) {
            service.submit(job);

        }
        service.shutdown();
    }
}
