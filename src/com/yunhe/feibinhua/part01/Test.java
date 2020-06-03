package com.yunhe.feibinhua.part01;
/**
 * 等腰三角形
 */
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
         Scanner scan=new Scanner(System.in);
         System.out.println("请输入三角形的腰");
         int n=scan.nextInt();
         scan.close();
        int k=n,v=2,u=k;
        for(int y=0;y<n;y++){
            for(int x=0;x<n*2;x++){
                if(x<k){
                    System.out.print(' ');
                    continue;
                }else if(x>u){
                    System.out.print(' ');
                    continue;
                    
                }
                System.out.print("*");
            }
            System.out.println();
            u++;
            k--;
        }
    }
}