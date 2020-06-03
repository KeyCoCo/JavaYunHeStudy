package com.yunhe.feibinhua.part32.Multithreading;

/**
 * 实现Runnable接口run方法
 */
public class RunnableDemo implements Runnable{
    private int i=100;
    private String strName;
    private int k;

    /**
     *
     * @param k 相加的值
     * @param strName 线程名称
     */
    public RunnableDemo(int k,String strName){
        this.k=k;
        this.strName=strName;
    }
    @Override
    public void run(){
        while (i>0){
            System.out.println(strName+(i+=k));
        }
    }
}
