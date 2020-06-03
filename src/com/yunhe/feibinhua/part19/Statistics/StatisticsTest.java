package com.yunhe.feibinhua.part19.Statistics;

import java.util.Scanner;
//统计测试类
public class StatisticsTest {
    public static void main(String[] args) {
        Char_Statistics Statistics=new Char_Statistics();
        System.out.println("请输入一行字符串");
        Scanner scan=new Scanner(System.in);
        String TxT=scan.nextLine();
        scan.close();
        Statistics.Char_Statistic(TxT);
    }
}