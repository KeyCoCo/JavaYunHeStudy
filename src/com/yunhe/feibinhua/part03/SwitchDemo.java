package com.yunhe.feibinhua.part03;
/**
 * 输入月份判断季节
 */
public class SwitchDemo {
    public static void main(String[] args) {
        int mouth=8;
        if(mouth>12||mouth<1){
            System.out.println("输入月份错误请重新输入！！！");
        }else{
            switch (mouth){
                case 1:
                case 2:
                case 3:
                    System.out.println("春");
                    break;
                case 4:
                case 5:
                case 6:
                    System.out.println("夏");
                    break;
                case 7:
                case 8:
                case 9:
                    System.out.println("秋");
                    break;
                case 10:
                case 11:
                case 12:
                    System.out.println("冬");
                    break;
            }
        }
    }
}