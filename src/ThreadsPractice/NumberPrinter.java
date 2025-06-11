package ThreadsPractice;

public class NumberPrinter implements Runnable{

    private final int number;

    NumberPrinter(int number){
        this.number = number;

    }

    @Override
    public void run() {
        System.out.println(" The Number is : "+this.number+" printed by "+Thread.currentThread().getName());
    }
}
