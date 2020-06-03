package com.yunhe.feibinhua.part01;
/**
 * java变量的运用
 * 
 */

public class Main{
    static int number = 23;

    public static void main(String[] args) {
        // // 变量的定义 <DataType> DataName=DataValue;
        // int i = 1;
        // int x;
        // x = 2;
        // System.out.println(number);
        // //数据转换
        // byte k=2;
        // int j=k+1;//从低到高自动转换
        // long n=8888888888888L;
        // int n1=(int)n;//从高到低强制转化
        // System.out.println("动态转换："+j+"强制转换："+n1);
        // byte a1=5,a2=2,a;
        // a = (byte)(a1 + a2);//jvm在处理字节码指令时通常将字节长度小于int的数据自动转换成int类型进行计算因long字节长度大于int所以不能进行自动转换。解决方法：强制转换或改变变量类型
        // a=5+2;

        // //计算顺序从左到右
        // System.out.println("你好"+"世界");
        // System.out.println('a'+1);//运算时进行了自动转换字符a的ascii码表是97
        // System.out.println("5+5="+5+5);//5+5=55从左到右计算
        // System.out.println(5+5+"=5+5");//10=5+5从左到右先进行加运算再拼接字符串
       

        // Scanner in = new Scanner(System.in);
        // String s = in.nextLine();
        // System.out.println(s);
        for (int i = 0; i < 6; i++) {

            for (int g = 0; g < 6 - i; g++) {
                System.out.print(" ");
            }


            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }

            System.out.println(" ");
        }

    }
}
