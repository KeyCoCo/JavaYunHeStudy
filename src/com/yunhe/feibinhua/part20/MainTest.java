package com.yunhe.feibinhua.part20;
/**
 * 主测试类
 */
import java.util.Scanner;

public class MainTest {
    public static void main(String[] args) {
        User_Logon logon = new User_Logon();
        Sign_in sig=new Sign_in();
        while (true) {
            System.out.println("请输入序号办理业务1.注册2.登录3.退出系统");
            Scanner scan = new Scanner(System.in);
            int point = scan.nextInt();
            switch (point) {
                case 1:
                    logon.Logon();
                    break;
                case 2:
                    sig.Sign(logon.getLibray());
                    break;
                case 3:
                    return;
                default:
                    System.out.println("找不到您需要的选项");
            }
        }

    }
}