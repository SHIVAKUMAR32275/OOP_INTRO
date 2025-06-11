package Executors;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class ExecutorsSampleExample {
    public static void main(String[] args) {

        System.out.println();
        System.out.println();

        Executor executor = Executors.newSingleThreadExecutor();

        executor.execute(()->{
            System.out.println(" Running in the thread : "+Thread.currentThread().getName());
        });
    }
}
