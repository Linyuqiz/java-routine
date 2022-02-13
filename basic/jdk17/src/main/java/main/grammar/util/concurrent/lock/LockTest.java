package main.grammar.util.concurrent.lock;

import org.junit.jupiter.api.Test;

import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class LockTest {

    @Test
    void lock() {
        ReentrantReadWriteLock readWriteLock = new ReentrantReadWriteLock();
        readWriteLock.readLock().lock();
        readWriteLock.readLock().unlock();
    }

    @Test
    void lock1() {
        ReentrantLock lock = new ReentrantLock();
        lock.tryLock();
        lock.unlock();
    }

}
