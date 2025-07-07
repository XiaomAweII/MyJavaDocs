package com.tuling.jucdemo.thread;

/**
 * @author: Fox
 * @Desc:  jdk21虚拟线程例子
 *
 **/
public class VTDemo {

    public static void main(String[] args) throws InterruptedException {

        //平台线程
        Thread.ofPlatform().start(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread());
            }
        });

        //虚拟线程2
        Thread vt = Thread.ofVirtual().start(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread());
            }
        });
        //等待虚拟线程打印完毕再退出主程序
        vt.join();

    }
}
