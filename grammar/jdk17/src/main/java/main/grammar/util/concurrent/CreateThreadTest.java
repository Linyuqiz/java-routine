package main.grammar.util.concurrent;

import lombok.SneakyThrows;
import org.junit.jupiter.api.Test;

import java.util.concurrent.*;

@SuppressWarnings("all")
public class CreateThreadTest {

    @Test
    void threadDemo() {
        class Animal extends Thread {
            @Override
            public void run() {
                System.out.println("new Animal!");
            }
        }
        new Animal().start();
    }

    @Test
    void threadDemo1() {
        class Animal implements Runnable {
            @Override
            public void run() {
                System.out.println("new Animal!");
            }
        }
        new Thread(new Animal()).start();
    }

    @Test
    void threadDemo2() {
        new Thread(() -> new Runnable() {
            @Override
            public void run() {
                System.out.println("new thread by lambda!");
            }
        }).start();
    }

    @Test
    @SneakyThrows
    void threadDemo3() {
        class Animal implements Callable<String> {
            @Override
            public String call() {
                return "new Animal!";
            }
        }
        FutureTask<String> futureTask = new FutureTask<>(new Animal());
        new Thread(futureTask).start();
        System.out.println(futureTask.get());
    }

    @Test
    void threadDemo4() {
        ExecutorService service = Executors.newCachedThreadPool();
        service.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("new thread by thread pool!");
            }
        });
    }

    @Test
    @SneakyThrows
    void threadDemo5() {
        class Animal implements Callable<String> {
            @Override
            public String call() {
                return "new Animal!";
            }
        }

        ExecutorService service = Executors.newCachedThreadPool();
        Future<String> future = service.submit(new Animal());
        System.out.println(future.get());
    }

}
