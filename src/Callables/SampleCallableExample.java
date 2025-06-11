package Callables;

import java.util.concurrent.*;

/// This class implements Callable, which allows it to run in a separate thread and return a result
public class SampleCallableExample implements Callable<String> {

    /// The call() method will be executed when the task runs
    public String call() throws Exception {
        System.out.println("---------Task is started successfully-------");

        /// Simulating an exception every time this method runs
        if (true) {
            throw new Exception("stimulated failure in call() method");
        }

        /// This line will not be reached because of the exception above
        Thread.sleep(4000);
        return "welcome to callable implementation";
    }

    public static void main(String[] args) {
        System.out.println();
        System.out.println();

       /// Step 1: Create a thread pool with one thread
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        /// Step 2: Create an object of the Callable class
        SampleCallableExample task = new SampleCallableExample();

        /// Step 3: Submit the task to the executor; it returns a Future object
        Future<String> future = executorService.submit(task);

        try {
            /// Step 4: Ask for the result (this will wait for the task to finish)
            System.out.println("Task is submitted, waiting for the result------------");

            /// Since the call() throws an exception, this line will throw ExecutionException
            String result = future.get();
            System.out.println("The Result is: " + result);
        } catch (ExecutionException e) {
            /// This block runs when the Callable task throws an exception
            System.out.println("Caught exception: " + e.getMessage());
            System.out.println("Cause of exception: " + e.getCause());
        } catch (InterruptedException i) {
            /// This block runs if the thread is interrupted while waiting for the result
            System.out.println("Interrupted exception occurred");
        }

        /// Step 5: Shut down the executor to clean up resources
        executorService.shutdown();
    }
}
