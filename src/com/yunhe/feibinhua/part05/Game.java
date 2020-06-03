package com.yunhe.feibinhua.part05;

import java.util.Scanner;

/**
 * 猜拳小游戏
 */
public class Game {
    public static void main(String[] args) {
        System.out.println("----------猜拳-----------");
        System.out.println("请输入石头剪刀或布");
        int User_Num = 0, Computer_Num = 0;
        int User = 0, n = 0;
        while (true) {
            n++;
            Scanner scan = new Scanner(System.in);
            String User_input = scan.nextLine();
            int Computer_input = (int) (Math.random() * 3);
            String[] Value = { "剪刀", "石头", "布" };
            for (int k = 0; k < Value.length; k++) {
                if (User_input.equals(Value[k])) {
                    User = k;
                    break;
                }
            }
            if (User == 0 && Computer_input == 2 || User == 2 && Computer_input == 0) {
                if (User == 2) {
                    System.out.println("第" + n + "把，玩家胜 玩家：" + User_input + "电脑：" + Value[Computer_input]);
                    User_Num++;
                    continue;
                } else if (Computer_input == 2) {
                    System.out.println("第" + n + "把，电脑胜 玩家：" + User_input + "电脑：" + Value[Computer_input]);
                    Computer_Num++;
                    continue;
                }
            }
            if (User > Computer_input) {
                System.out.println("第" + n + "把，玩家胜 玩家：" + User_input + "电脑：" + Value[Computer_input]);
                User_Num++;
            } else if (Computer_input > User) {
                System.out.println("第" + n + "把，电脑胜 玩家：" + User_input + "电脑：" + Value[Computer_input]);
                Computer_Num++;
            } else {
                System.out.println("第" + n + "把，平局 玩家：" + User_input + "电脑：" + Value[Computer_input]);
            }
            if (n >= 5) {
                if (User_Num > Computer_Num) {
                    System.out.println("游戏结束玩家胜玩家胜利" + User_Num + "次，电脑胜利" + Computer_Num + "次！");
                    break;
                } else if (Computer_Num > User_Num) {
                    System.out.println("游戏结束电脑胜玩家胜利" + User_Num + "次，电脑胜利" + Computer_Num + "次！");
                    break;
                } else if (User_Num == Computer_Num) {
                    System.out.println("平局玩家胜利" + User_Num + "次，电脑胜利" + Computer_Num + "次！");
                    break;
                }
            }

        }

    }
}