package com.thread.concurrency.queue.blocking;

import lombok.val;
import org.junit.jupiter.api.Test;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.DelayQueue;


public class DelayBlockingQueueTest {

    @Test
    public void test() {
        BlockingQueue delayQueue = new DelayQueue();

        val t1 = new Thread(() -> {
            delayQueue.add(1);
            System.out.println("===============");
        }, "t1");

        t1.start();
    }
}