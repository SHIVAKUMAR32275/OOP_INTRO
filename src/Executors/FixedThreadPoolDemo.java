package Executors;

import javax.swing.plaf.TableHeaderUI;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FixedThreadPoolDemo {

    static  class BankTask implements Runnable{

        private final int customer_id;

        public BankTask(int customer_id){
            this.customer_id = customer_id;
        }


        @Override
        public void run() {
            System.out.println(" Customer : "+customer_id+" is served by "+Thread.currentThread().getName());

            try{
                Thread.sleep(2000);
            }
            catch (InterruptedException e){
                Thread.currentThread().interrupt();
            }

            System.out.println(" the customer : "+customer_id+" is completed by "+Thread.currentThread().getName());
        }


        public static void main(String[] args) {

            System.out.println();
            System.out.println();
            ExecutorService fixedThread = Executors.newFixedThreadPool(5);

            for (int i=1;i<=5;i++){
                fixedThread.submit(new BankTask(i));
            }

        }
    }
}
