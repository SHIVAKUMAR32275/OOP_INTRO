package ThreadsPractice;

public class HelloWorldPrinter implements  Runnable {

    public void print(){
        System.out.println(" Hello from Thread : "+Thread.currentThread().getName());
    }


    public void run(){
        print();
    }
}
