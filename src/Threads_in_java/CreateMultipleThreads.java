package Threads_in_java;


/// creating multiple threads using extends keyword
public class CreateMultipleThreads extends Thread{

    String name;

    CreateMultipleThreads(String name){
        this.name = name;
    }

    public void  run(){
        for( int i=0;i<5;i++){
            System.out.println(" This is  "+this.name+" : "+i);
        }
        System.out.println(" it is exiting from thread"+this.name);
    }


    public static void main(String[] args) throws InterruptedException {
        CreateMultipleThreads t1 = new CreateMultipleThreads("MyThreadA");
        CreateMultipleThreads t2 = new CreateMultipleThreads("MyThreadB");
        t1.start();
        t1.join();  /// You want to control the execution flow of threads.
        t2.start();
    }
}


