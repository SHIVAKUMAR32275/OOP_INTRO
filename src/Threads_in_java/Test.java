package Threads_in_java;

public class Test {
    public static void main(String[] args) {
        MyThreadA myThread = new MyThreadA();
        myThread.start();

        MyThreadB myThreadA = new MyThreadB();
        Thread thread = new Thread(myThreadA);
        thread.start();

        for( int i=0;i<5;i++)
        {
            System.out.println(" this is main thread ");
        }
    }
}
