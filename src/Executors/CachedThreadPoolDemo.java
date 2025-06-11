package Executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CachedThreadPoolDemo {

    static class  LightWeightTask implements Runnable{
        private  final int taskId;

        LightWeightTask(int taskId){
            this.taskId = taskId;
        }


        @Override
        public void run() {
            System.out.println(" Your task : "+taskId+" is handled by "+Thread.currentThread().getName());
            try{
                Thread.sleep(1000);
            }
            catch (InterruptedException e){
                Thread.currentThread().interrupt();
            }

            System.out.println("Task : "+ taskId +"  completed by :  "+ Thread.currentThread().getName());
        }
    }


    public static void main(String[] args) {

        System.out.println();
        System.out.println();

        // Create a cached thread pool
        ExecutorService executorService = Executors.newCachedThreadPool();


        for( int i=1;i<=5;i++){
            executorService.submit(new LightWeightTask(i));
        }


        try{
            Thread.sleep(10000);
        }
        catch (InterruptedException e){
            Thread.currentThread().interrupt();
        }


        System.out.println();
        System.out.println();

        System.out.println("----------submitting second batch tasks--------------------");

        System.out.println();
        System.out.println();

        for (int i=6;i<=10;i++){
            executorService.submit(new LightWeightTask(i));
        }

        executorService.shutdown();
    }
}
