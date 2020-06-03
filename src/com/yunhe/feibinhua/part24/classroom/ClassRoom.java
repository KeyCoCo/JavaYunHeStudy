package com.yunhe.feibinhua.part24.classroom;

import java.util.HashMap;


public class ClassRoom {
    HashMap<String,Integer> hashMap=new HashMap<>();

    /**
     *
     * @param name
     * @return 所教人数
     */
    public int room(String name){
        hashMap.put("王老师",34);
        hashMap.put("李老师",88);
        hashMap.put("张老师",33);
        return hashMap.get(name);
    }
}
