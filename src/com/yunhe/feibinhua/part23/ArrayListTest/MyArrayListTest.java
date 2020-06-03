package com.yunhe.feibinhua.part23.ArrayListTest;
/**
 * 自定义集合测试类
 * @author 费斌华
 * @date 2020.05.09
 * */

public class MyArrayListTest {
    public static void main(String[] args) {
        //泛型的调用
        genericTest<String> T=new genericTest<>();
        System.out.println(T.ret("String"));
        MyArrayList<Object> Arr=new MyArrayList<>();
        Arr.Add("a");
        Arr.Add("b");
        Arr.Add("c");
        Arr.Add("d");
        Arr.Delete(0);
        Arr.Change(2,5);
        Arr.Check(2);
        System.out.println("数组长度为"+Arr.Size());
        System.out.println(Arr.ToString());

    }


}
