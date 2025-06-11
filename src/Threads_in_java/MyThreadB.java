package Threads_in_java;

public class MyThreadB implements Runnable{
    @Override
    public void run() {
        for( int i=0;i<5;i++)
        {
            System.out.println(" this is 2nd thread by implementing interface");
        }
    }
}
