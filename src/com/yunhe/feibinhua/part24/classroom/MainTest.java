package com.yunhe.feibinhua.part24.classroom;

import java.util.Scanner;

public class MainTest {
    public static void main(String[] args) {
        ClassRoom rom = new ClassRoom();
        System.out.println("请输入某位老师");
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        try {
            System.out.println("老师：" + name + "   学生：" + rom.room(name) + "人");

        } catch (Exception e) {
            System.out.println("教师名输入错误");
        }
    }
}
