package com.yunhe.feibinhua.part04;

import java.util.Scanner;

public class ArrayTest {
    public static void main(String[] args) {
        //保存年、月、日
        int year=2020,mouth=4,day=8;
        boolean m=false;
        int result=0;
        System.out.println("现在时间为"+year+"年"+mouth+"月"+day+"日");
        //计算一年已过多少天，还剩多少天
        //判断是否是闰年
        if(year%400==0||year%4==0&&year%100!=0){
            m=true;
            for(int i=1;i<=mouth;i++){
                switch (i){
                    case 1:
                    case 3:
                    case 5:
                    case 7:
                    case 8:
                    case 10:
                    case 12:
                    result+=31;
                    break;
                    case 2:
                    result+=29;
                    break;
                    case 4:
                    case 6:
                    case 9:
                    case 11:
                    result+=30;
                    break;
                }
            }
        }else{
            for(int i=1;i<=mouth;i++){
                switch (i){
                    case 1:
                    case 3:
                    case 5:
                    case 7:
                    case 8:
                    case 10:
                    case 12:
                    result+=31;
                    break;
                    case 2:
                    result+=28;
                    break;
                    case 4:
                    case 6:
                    case 9:
                    case 11:
                    result+=30;
                    break;
                }
            }
        }
        result+=day;
        int result1;
        if(m){
            result1=366-result;
        }else{
            result1=365-result;
        }
        System.out.println(year+"年，已过"+result+"天还剩"+result1+"天");
        //分数评级
        Scanner scan=new Scanner(System.in);
        System.out.println("请输入你的成绩：");
        int Num=scan.nextInt();
        switch(Num/10){
            case 10:
            System.out.println("优秀");
            break;
            case 9:
            case 8:
            System.out.println("优秀");
            break;
            case 7:
            System.out.println("良好");
            break;
            case 6:
            System.out.println("及格");
            break;
            case 5:
            case 4:
            case 3:
            case 2:
            case 1:
            case 0:
            System.out.println("不及格");
            break;
        }
        //输出1~10并求和
        int R=0;
        for(int i=1;i<=10;i++){
            System.out.print(i+"\t");
            R+=i;
        }
        System.out.println("从1~10的和为："+R);
        //输出10~1
        for(int i=10;i>=1;i--){
            System.out.print(i+"\t");
        }
        //计算0~100之间的奇数和与偶数和
        int R1=0,R2=0;
        for(int i=1;i<=100;i++){
            if(i%2!=0){
                R1+=i;
            }else{
                R2+=i;
            }
        }
        System.out.println("奇数和为："+R1+"，偶数和为："+R2);
        //求出输入数的阶乘
        long R3=1;
        System.out.println("请输入一个数");
        int N=scan.nextInt();
        scan.close();
        for(int i=1;i<=N;i++){
            R3*=i;
        }
        System.out.println(N+"的阶乘为"+R3);
        //水仙花数
        int N1=0;
        int First,Second,Third;
        System.out.print("水仙花数分别为:");
        for(int i=100;i<1000;i++){
            First=i%10;
            Second=i/10%10;
            Third=i/100;
            if(Math.pow(First,3)+Math.pow(Second,3)+Math.pow(Third,3)==i){
                System.out.print(i+"\t");
                N1++;
            }
        }
        System.out.println("共有"+N1+"个水仙花数");

    }
}
    