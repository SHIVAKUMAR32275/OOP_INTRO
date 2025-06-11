package ThreadsPractice;

public class Client3 {
    public static void main(String[] args) {
        System.out.println();

        for (int i=1;i<=5;i++){
            Runnable task = new NumberPrinter(i);
            Thread thread = new Thread(task);
            thread.setName(" worker --" +i);
            thread.start();
        }
    }
}
