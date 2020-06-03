package com.yunhe.feibinhua.part32;

/**
 * 多线程文件创建并写入测试
 */

public class MultithreadingFileTest {
    public static void main(String[] args) {
        MultithreadingFile multithreadingFile1=new MultithreadingFile(".\\src\\com\\yunhe\\FeiBinHua\\part32\\多线程文件\\1\\");
        MultithreadingFile multithreadingFile2=new MultithreadingFile(".\\src\\com\\yunhe\\FeiBinHua\\part32\\多线程文件\\2\\");
        MultithreadingFile multithreadingFile3=new MultithreadingFile(".\\src\\com\\yunhe\\FeiBinHua\\part32\\多线程文件\\3\\");
        multithreadingFile1.start();
        multithreadingFile2.start();
        multithreadingFile3.start();
    }
}
