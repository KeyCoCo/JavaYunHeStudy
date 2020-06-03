package com.yunhe.feibinhua.part23.setTest;

import java.util.HashSet;
import java.util.TreeSet;
/**
 * set集合中的元素不能重复
 * */
public class SetTest {
    public static void main(String[] args) {
        HashSet<Integer> st=new HashSet<>();
        st.add(22);
        st.add(33);
        st.add(888);
        st.add(44);
        st.add(55);
        st.add(44);
        System.out.println(st);
        TreeSet<Integer> ts=new TreeSet<>();
        ts.add(34);
        ts.add(14);
        ts.add(29);
        ts.add(66);
        ts.add(111);
        ts.add(99);
        ts.add(88);
        ts.add(88);
        System.out.println(ts);
        for(int i:ts){

        }
    }
}
