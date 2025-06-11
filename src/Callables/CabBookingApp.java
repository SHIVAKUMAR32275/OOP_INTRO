package Callables;

import java.util.ArrayList;
import java.util.concurrent.*;

public class CabBookingApp {

    /// Step 1: Define a Callable implementation for Uber booking
    static class Uber implements Callable<String> {
        @Override
        public String call() throws Exception {
            System.out.println(" Uber booking is started : " + Thread.currentThread().getName());

            try {
                Thread.sleep(4000); // Simulate booking delay
            } catch (InterruptedException e) {
                Thread.interrupted(); // Handle interruption
            }

            System.out.println(" Your uber booking is confirmed " + Thread.currentThread().getName());
            return "---------successfully booked Uber ------";
        }
    }

    /// Step 2: Define a Callable implementation for Rapido booking
    static class Rapido implements Callable<String> {
        @Override
        public String call() throws Exception {
            System.out.println(" Rapido booking is started : " + Thread.currentThread().getName());

            try {
                Thread.sleep(4000); // Simulate booking delay
            } catch (InterruptedException e) {
                Thread.interrupted(); // Handle interruption
            }

            System.out.println(" Your Rapido booking is confirmed " + Thread.currentThread().getName());
            return "---------successfully booked Rapido ---------";
        }
    }

    /// Step 3: Define a Callable implementation for Ola booking
    static class Ola implements Callable<String> {
        @Override
        public String call() throws Exception {
            System.out.println(" Ola booking is started : " + Thread.currentThread().getName());

            try {
                Thread.sleep(4000); // Simulate booking delay
            } catch (InterruptedException e) {
                Thread.interrupted(); // Handle interruption
            }

            System.out.println(" Your Ola booking is confirmed " + Thread.currentThread().getName());
            return "---------successfully booked Ola -----------";
        }
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        System.out.println();
        System.out.println();

        /// Step 4: Create a single-threaded executor service
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        /// Step 5: Create instances of the Callable tasks
        Callable<String> rapidoCallable = new Rapido();
        Callable<String> uberCallable = new Uber();
        Callable<String> OlaCallable = new Ola();

        /// Step 6: Add all tasks to a list
        java.util.List<Callable<String>> cabApp = new ArrayList<>();
        cabApp.add(rapidoCallable);
        cabApp.add(OlaCallable);
        cabApp.add(uberCallable);

        /// Step 7: Submit all tasks using invokeAny (only first successful result will be returned)
        System.out.println(" ---submitting all the tasks to executor ");
        System.out.println();

        String res = executorService.invokeAny(cabApp);  // Blocks until one task finishes successfully

        /// Step 8: Print the result of the first completed task
        System.out.println();
        System.out.println(" The result is : " + res);

        /// Step 9: Shut down the executor (remaining tasks may still complete if already queued)
        executorService.shutdown();
    }
}
