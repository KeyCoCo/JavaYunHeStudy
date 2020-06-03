package com.yunhe.feibinhua.part10;

import java.util.Scanner;

public class BankTest {
    public void Bank(){
        System.out.println("=======天地银行=======");
        Scanner scan=new Scanner(System.in);
        System.out.println("请输入姓名：");
        String Name=scan.nextLine();
        System.out.println("请输入电话号：");
        String Phone_Number=scan.nextLine();
        System.out.println("请输入预存金额：");
        int Money=scan.nextInt();
        Account acc=new Account(Name, Phone_Number, Money);
        
        
        while(true){
            System.out.println("1.查询信息 2.存钱 3.取钱 4.退出");
            int k=scan.nextInt();
            if(k==4){
                System.out.println("已退出系统");
                break;
            }
            switch(k){
            case 1:
            acc.output_Message();
            break;
            case 2:
            System.out.println("请输入存钱金额");
            int Store_Mon=scan.nextInt();
            acc.Store_Money(Store_Mon);
            break;
            case 3:
            System.out.println("请输入取钱金额");
            int Take_Mon=scan.nextInt();
            acc.Take_Money(Take_Mon);
            break;
            default:
            System.out.println("输入编号错误找不到你要的选项！");
        }
        
        }
        



    }
}