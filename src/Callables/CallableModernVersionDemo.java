package Callables;

import java.util.concurrent.*;

public class CallableModernVersionDemo {

    public static void main(String[] args) throws InterruptedException, ExecutionException {

        /// Step 1: Create a Callable task using a lambda expression
        /// This task simulates some work by sleeping for 5 seconds
        Callable<String> task = () -> {
            Thread.sleep(5000); // Simulate delay
            return "welcome to modern version of callable : " + Thread.currentThread().getName();
        };

        System.out.println();
        System.out.println();

        /// Step 2: Indicate that the task is starting
        System.out.println(" -------task is getting started ----------");

        /// Step 3: Create a single-threaded executor to run the task
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        /// Step 4: Submit the Callable task to the executor and receive a Future object
        Future<String> future = executorService.submit(task);

        /// Step 5: Block and wait for the task to complete and get the result
        String result = future.get();

        /// Step 6: Print the result of the Callable task
        System.out.println(" the Output is : " + result);

        /// Step 7: Shutdown the executor service
        executorService.shutdown();
    }
}
