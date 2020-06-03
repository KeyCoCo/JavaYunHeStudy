package com.yunhe.feibinhua.part04;

import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入一个数");
        int num = scan.nextInt();
        scan.close();
        if (num % 2 == 0) {
            System.out.println(num + "是偶数");
        }else{
            System.out.println(num+"不是一个偶数");
        }
        if (num >= 100 && num < 1000) {
            int first = num % 10, second = num / 10 % 10, third = num / 100;
            if (Math.pow(first, 3) + Math.pow(second, 3) + Math.pow(third, 3) == num) {
                System.out.println(num + "是水仙花数");
            }
        }
    }

}