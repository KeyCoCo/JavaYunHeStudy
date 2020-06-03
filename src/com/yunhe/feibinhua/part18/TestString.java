package com.yunhe.feibinhua.part18;

public class TestString {
    public static void main(String[] args) {
        //遍历字符串
        StringDemo Str=new StringDemo();
        Str.Ergodic();
        //将int类型数组转化为字符串
        int [] arr={2,3,45,1};
        Str.Splicing(arr);
        //首字母大写其余小写
        String txt="aBCID";
        Str.Transformation(txt);
        //搜索字符串在字典中出现的次数
        String txt1="abc";
        Str.Serch(txt1);
        //模拟登录
        Str.Login();
    }
}