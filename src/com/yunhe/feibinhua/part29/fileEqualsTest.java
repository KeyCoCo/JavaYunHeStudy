package com.yunhe.feibinhua.part29;

import java.io.IOException;

public class fileEqualsTest {
    public static void main(String[] args) throws IOException {
        fileEquals f=new fileEquals();
        String s1="D:\\Java_code\\Java_Learn\\src\\com\\yunhe\\FeiBinHua\\part29\\a\\a.txt";
        String s2="D:\\Java_code\\Java_Learn\\src\\com\\yunhe\\FeiBinHua\\part29\\a\\b.txt";
        System.out.println("这两个文本文件"+f.FEquals(s1,s2));
    }
}
