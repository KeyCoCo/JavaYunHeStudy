package com.yunhe.feibinhua.part21;

import java.util.Scanner;
/**
 * 主方法调用
 * @author 费斌华
 * @version 1.0
 */
public class MainTest{
    public static void main(String[] args) {
        Days D=new Days();
        System.out.println("请输入年份");
        Scanner scan=new Scanner(System.in);
        int year=scan.nextInt();
        System.out.println("所选年一共有"+D.DayOfYear(year)+"天");
        System.out.println("请输入月份");
        int mouth=scan.nextInt();
        System.out.println("所选月一共有"+D.DayOfMouth(year, mouth)+"天");
        
    }
}