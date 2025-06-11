package ThreadsPractice;

public class Client_NumberPrinter {
    public static void main(String[] args) {
        System.out.println();

        for (int i=1;i<=10;i++){
            Runnable task = new NumberPrinter(i);
            Thread thread = new Thread(task);
            thread.start();
        }

        System.out.println("The Main Thread  ends here : " + Thread.currentThread().getName());
    }
}
