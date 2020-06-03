package com.yunhe.feibinhua.part32.Multithreading;
/**
 * Thread测试
 */
public class ThreadDemoTest {
    public static void main(String[] args) {
        ThreadDemo threadDemo1=new ThreadDemo(-1,"线程一");
        ThreadDemo threadDemo2=new ThreadDemo(1,"线程二");
        ThreadDemo threadDemo3=new ThreadDemo(-1,"线程三");
        ThreadDemo threadDemo4=new ThreadDemo(-1,"线程四");
        threadDemo1.start();
        threadDemo2.start();
        threadDemo3.start();
        threadDemo4.start();
    }
}
