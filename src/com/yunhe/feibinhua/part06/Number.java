package com.yunhe.feibinhua.part06;
import java.util.Scanner;
/**
 * 
 * 猜数字小游戏
 * 
 */
public class Number {
    public static void main(String[] args) {
        System.out.println("-------猜数字-------");
        Scanner scan=new Scanner(System.in);
        int rand=Computer();
        System.out.println(rand);
        while(true){
            System.out.println("请输入一个0~10以内的数字");
            int Player_input=scan.nextInt();
            System.out.println(Judge(rand, Player_input));
            if("恭喜你猜对了！".equals(Judge(rand, Player_input))){
                break;
            }
        }
    }
    public static int Computer(){
        return (int)(Math.random()*10);
    } 
    public static String Judge(int Computer_value, int Player_value) {
        if(Computer_value==Player_value){
            return "恭喜你猜对了！";
        }else{
            if(Player_value>Computer_value){
                return "猜大了";
            }
            else{
                return "猜小了";
            }
        }
    }

}