package com.yunhe.feibinhua.part32.Multithreading;

/**
 * 重写Thread父类run方法
 */
public class ThreadDemo extends Thread{
    private int k;
    private String strName;
    private int i=100;
    /**
     *
     * @param k 相加的值
     * @param strName 线程名称
     */
    public ThreadDemo(int k,String strName){
        this.k=k;
        strName=strName;
    }
    @Override
    public void run(){
        while (i>0){
                System.out.println(strName+(i+=k));
        }
    }
}
