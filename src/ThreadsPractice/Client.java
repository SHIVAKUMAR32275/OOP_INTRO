package ThreadsPractice;

public class Client {
    public static void main(String[] args) {
        System.out.println();

        Runnable task = new HelloWorldPrinter();
        Thread t1 = new Thread(task);
        t1.start();


        /// this is the main method implementation
        System.out.println(" this is the main method implementation");

    }
}
