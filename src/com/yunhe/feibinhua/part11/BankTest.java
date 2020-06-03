package com.yunhe.feibinhua.part11;

import java.util.Scanner;

public class BankTest {
    public void Bank() {
        // 银行
        System.out.println("欢迎来到天地银行");
        Atm atm = new Atm();
        boolean Is_Sign = false;
        while (true) {
            System.out.println("输入选项办理业务选项：1. 开户 2. 登录账户 3. 查询 4. 存款 5. 取款 6. 转账 7. 退出系统");
            Scanner scan = new Scanner(System.in);
            int point = scan.nextInt();
            if (point == 7) {
                break;
            }
            switch (point) {
                case 1:
                    System.out.println(atm.Open_Account());
                    break;
                case 2:

                    Is_Sign = atm.Sign_in();
                    break;

                case 3:
                    if (Is_Sign) {
                        System.out.println(atm.Search_Account(Is_Sign, atm.User_Name));
                    } else {
                        System.out.println("账号未登录");
                    }
                    break;
                case 4:
                    if (Is_Sign) {
                        int Save_Money = scan.nextInt();
                        System.out.println(atm.Deposit(Save_Money, atm.User_Name));
                    } else {
                        System.out.println("账号未登录");
                    }

                    break;
                case 5:
                    if (Is_Sign) {
                        int Take_Money = scan.nextInt();
                        System.out.println(atm.Take_Money(Take_Money, atm.User_Name));
                    } else {
                        System.out.println("账号未登录");
                    }
                    break;
                case 6:
                    if (Is_Sign) {
                        System.out.println(atm.Transfer_Account(atm.User_Name));
                    } else {
                        System.out.println("账号未登录");
                    }
                    break;
                default:
                    System.out.println("输入选项错误请重新输入！");
            }
        }

    }
}