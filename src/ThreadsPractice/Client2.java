package ThreadsPractice;

public class Client2 {
    public static void main(String[] args) {

        System.out.println();


        Runnable task = new HelloWorldPrinter();
        Thread thread = new Thread(task);
        thread.start();  /// step 1

        task.run(); /// step 2 ( this gives the " main " keyword )


        System.out.println(" The Main threads here :  "+Thread.currentThread().getName());
    }
}
