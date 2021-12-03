package concurrence;

import org.junit.jupiter.api.Test;

import java.util.concurrent.*;

public class CreateThreadTest {

    @Test
    void inheritThread() {
        class Animal extends Thread {
            @Override
            public void run() {
                System.out.println("new Animal!");
            }
        }
        new Animal().start();
    }

    @Test
    void implementRunnable() {
        class Animal implements Runnable {
            @Override
            public void run() {
                System.out.println("new Animal!");
            }
        }
        new Thread(new Animal()).start();
    }

    @Test
    void lambdaForThread() {
        new Thread(() -> new Runnable() {
            @Override
            public void run() {
                System.out.println("new thread by lambda!");
            }
        }).start();
    }

    @Test
    void threadForThreadPool() {
        ExecutorService service = Executors.newCachedThreadPool();
        service.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("new thread by thread pool!");
            }
        });
    }

    @Test
    void implementCallable() throws ExecutionException, InterruptedException {
        class Animal implements Callable<String> {
            @Override
            public String call() throws Exception {
                return "new Animal!";
            }
        }
        FutureTask<String> futureTask = new FutureTask<>(new Animal());
        new Thread(futureTask).start();
        System.out.println(futureTask.get());
    }

    @Test
    void implementCallableByThreadPool() throws ExecutionException, InterruptedException {
        class Animal implements Callable<String> {
            @Override
            public String call() throws Exception {
                return "new Animal!";
            }
        }
        ExecutorService service = Executors.newCachedThreadPool();
        Future<String> future = service.submit(new Animal());
        System.out.println(future.get());
    }

}
