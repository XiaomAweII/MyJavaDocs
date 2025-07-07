package com.tuling.jucdemo.thread;

import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

/**
 * @author: Fox
 * @Desc:
 **/
public class VTDemo2 {
    public static void main(String[] args) throws InterruptedException {

        Set<String> threadNames = ConcurrentHashMap.newKeySet();
        //使用Executors创建虚拟线程
        ExecutorService executor = Executors.newVirtualThreadPerTaskExecutor();
        //创建100万个虚拟线程
        IntStream.range(0,1000000).forEach(i -> {
            executor.submit(() -> {

                String threadInfo = Thread.currentThread().toString();
                String workerName = threadInfo.split("@")[1];
                threadNames.add(workerName);
                return i;
            });
        });

        Thread.sleep(5000);

        System.out.println("Platfrom Threads: "+threadNames.size());

    }
}
