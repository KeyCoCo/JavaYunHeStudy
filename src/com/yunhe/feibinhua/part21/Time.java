package com.yunhe.feibinhua.part21;

import java.util.Calendar;
import java.util.Scanner;
/**
 * 计算在世天数结果不计当天
 * @author 费斌华
 * @version 1.0
 */
public class Time {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        Days d=new Days();
        int result=0;
        Calendar c=Calendar.getInstance();
        System.out.println("请输入你的生日");
        int year=scan.nextInt();
        int mouth=scan.nextInt();
        int day=scan.nextInt();
        for(;year<c.get(Calendar.YEAR);year++){
            result+=d.DayOfYear(year);//调用年方法
        }
        result+=c.get(Calendar.DAY_OF_YEAR);//加所在年的天数
        c.set(year,mouth-1,day);
        result-=c.get(Calendar.DAY_OF_YEAR);//减生日所在年的天数
        System.out.println("在世天数："+(result+1));
    }
}