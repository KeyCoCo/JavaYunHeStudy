package com.yunhe.feibinhua.part23.GatherTest;

import java.util.Scanner;

public class GatherTest {
    public static void main(String[] args) {
        Gather gather=new Gather();
        System.out.println("增-------------------");
        gather.Add();
        System.out.println("删-------------------");
        gather.Remove();
        System.out.println("改-------------------");
        Scanner scan=new Scanner(System.in);
        System.out.println("请输入修改后的元素");
        String str=scan.nextLine();
        System.out.println("请输入要修改的数据下标");
        int index = scan.nextInt();
        gather.change(index,str);
        System.out.println("查-------------------");
        gather.check();
    }
}
