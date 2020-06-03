package com.yunhe.feibinhua.part11;

import java.util.Arrays;
import java.util.Scanner;

public class Atm {
    public String User_Name = null;
    private Account[] accounts = new Account[0];//储存用户对象
    private Scanner scan = new Scanner(System.in);
    //开户方法
    public String Open_Account() {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入姓名：");
        String Name = scan.nextLine();
        System.out.println("请输入手机号码：");
        String PhoneNumber = scan.nextLine();
        System.out.println("请输入账号");
        String User_Number = scan.nextLine();
        System.out.println("请输入账号密码");
        String User_Password = scan.nextLine();
        System.out.println("请输入预存金额");
        int Money = scan.nextInt();
        Account User_Account = new Account(Name, PhoneNumber, User_Number, User_Password, Money);
        accounts = Arrays.copyOf(accounts, accounts.length + 1);//拷贝一个新的accounts对象数组,将他的长度加1
        accounts[accounts.length - 1] = User_Account;//将新的对象赋值到对象数组的最后一位
        System.out.println(Arrays.toString(accounts));//打印当前储存的对象
        return "开户成功";
    }
    //登录方法
    public boolean Sign_in() {
        System.out.println("请输入账号：");
        String User_N = scan.nextLine();
        System.out.println("请输入密码：");
        String User_P = scan.nextLine();
        for (Account User : accounts) {
            if (User.User_Number.equals(User_N)) {
                if (User.User_Password.equals(User_P)) {
                    System.out.println("当前登录用户为" + User.Name);
                    User_Name = User.Name;
                    return true;
                }
            }
        }
        System.out.println("请检查用户名和密码是否输入正确");
        return false;
    }
    //查询方法
    public String Search_Account(boolean Is, String User_Name) {
        if (Is) {
            for (Account account : accounts) {
                if (account.Name.equals(User_Name)) {
                    return "姓名：" + account.Name + "\n" + "手机号：" + account.PhoneNumber + "\n" + "余额：" + account.Money
                            + "元";
                }
            }
        }
        return "账号未登录";
    }
    //存款方法
    public String Deposit(double Save_Money, String User_Name) {
        for (Account account : accounts) {
            if (account.Name.equals(User_Name)) {
                account.Money += Save_Money;
            }
        }
        return "存款成功";
    }
    //取款方法
    public String Take_Money(double Take_Money, String User_Name) {
        for (Account account : accounts) {
            if (account.Name.equals(User_Name)) {
                if (Take_Money > account.Money) {
                    return "余额不足";
                }
                account.Money -= Take_Money;
            }
        }
        return "取款成功";
    }
    //转账方法
    public String Transfer_Account(String Transfer_Name) {
        System.out.println("请输入收款人姓名：");
        String Receivables_Name = scan.nextLine();
        System.out.println("请输入转账金额：");
        int Tran_Money = scan.nextInt();
        for (Account account : accounts) {
            if (Transfer_Name.equals(account.Name)) {
                if (Tran_Money > account.Money) {
                    return "余额不足！！";
                }
                account.Money -= Tran_Money;
            } else if (Receivables_Name.equals(account.Name)) {
                account.Money += Tran_Money;
            } else {
                return "转账失败请检查收款人姓名是否为：" + Receivables_Name;
            }
        }
        return "转账成功";
    }
}