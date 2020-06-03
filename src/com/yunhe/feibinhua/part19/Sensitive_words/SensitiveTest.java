package com.yunhe.feibinhua.part19.Sensitive_words;
/**
 * 覆盖敏感词汇测试
 */
import java.util.Scanner;

public class SensitiveTest {
    public static void main(String[] args) {
        Sensitive_words sensitive=new Sensitive_words();
        Scanner scan=new Scanner(System.in);
        System.out.println("请输入消息");
        String stry=scan.nextLine();
        sensitive.Sensitive(stry);
        sensitive.Char_Cover(stry);
    }
}