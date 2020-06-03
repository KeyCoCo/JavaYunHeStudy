package com.yunhe.feibinhua.part32.Multithreading;

/**
 * Runnable测试
 */
public class RunnableDemoTest {
    public static void main(String[] args) {
        RunnableDemo runnableDemo1=new RunnableDemo(-1,"线程一");
        RunnableDemo runnableDemo2=new RunnableDemo(-1,"线程二");
        RunnableDemo runnableDemo3=new RunnableDemo(1,"线程三");
        RunnableDemo runnableDemo4=new RunnableDemo(-1,"线程四");
        new Thread(runnableDemo1).start();
        new Thread(runnableDemo2).start();
        new Thread(runnableDemo3).start();
        new Thread(runnableDemo4).start();

    }
}
