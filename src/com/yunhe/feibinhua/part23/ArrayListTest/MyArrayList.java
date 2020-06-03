package com.yunhe.feibinhua.part23.ArrayListTest;
/**
 * 具体接口实现方法
 * @author 费斌华
 * @date 2020.05.09
 * */
import java.util.Arrays;

public class MyArrayList<V> implements MyArray{
    public static final int ARRAYSIZE=0;
    public static Object[] Objects=new Object[ARRAYSIZE];
    private int DataSize=0;
    public V ret(Object o){
        return (V)o;
    }
    @Override
    /**
     * @param 一个任何类型的对象
     * */
    public void Add(Object O){
        if(DataSize>=ARRAYSIZE){
            Objects= Arrays.copyOf(Objects,Objects.length+1);
        }
        Objects[DataSize]=O;
        DataSize++;
    }
    @Override
    /**
     * @return 返回删除的元素
     * @param 需要删除的元素下标
     * */
    public Object Delete(int index){
        Object result=Objects[index];
        for(;index<Objects.length-1;index++){
            Objects[index]=Objects[index+1];
        }

        return result;
    }

    @Override
    /**
     * @param 需要修改的对象下标与修改后的元素
     * */
    public void Change(int index,Object O){
        Objects[index]=O;
    }
    @Override
    /**
     * @param 需要获取元素的下标
     * */
    public Object Check(int index){
        return Objects[index];
    }
    @Override
    /**
     * @return 返回数组尺寸大小
     * */
    public int Size(){
        return DataSize;
    }
    @Override
    /**
     * @return 将数组转化为字符串类型并返回
     * */
    public String ToString(){
        String str="[";
        for(Object s:Objects){
            str+=s+",";
        }
        str+=']';
        return str;
    }


}
