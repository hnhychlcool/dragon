package com.dragon.cate.web.controller.demo;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadTest {


    static class Task extends Thread {

        // 控制任务执行次数
        CountDownLatch latch;

        private String content;

        Task(String content, CountDownLatch latch) {
            this.content = content;
            this.latch = latch;
        }

        @Override
        public void run() {
            try {
                Thread.sleep(100L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print(content);
            latch.countDown();
        }
    }

    public static void main(String[] args) throws InterruptedException {

        ExecutorService executorService = Executors.newFixedThreadPool(3);

        int circles = 10;
        while (circles-- > 0) {
            CountDownLatch latchA = new CountDownLatch(1);
            CountDownLatch latchB = new CountDownLatch(1);
            CountDownLatch latchC = new CountDownLatch(2);
            Task taskA = new Task("阿", latchA);
            Task taskB = new Task("里", latchB);
            Task taskC = new Task("巴", latchC);
            executorService.execute(taskA);
            latchA.await(1, TimeUnit.SECONDS);
            executorService.execute(taskB);
            latchB.await(1, TimeUnit.SECONDS);
            executorService.execute(taskC);
            executorService.execute(taskC);
            latchC.await(1, TimeUnit.SECONDS);
        }
        executorService.shutdownNow();
    }
}
