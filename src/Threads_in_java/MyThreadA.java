package Threads_in_java;

public class MyThreadA extends Thread{

    public void run(){
        for( int i=0;i<5;i++){
            System.out.println(" child thread ");
        }
    }
}
