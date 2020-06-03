package com.yunhe.feibinhua.part23.ArrayListTest;
/**
 * 实现集合接口
 * @author 费斌华
 * @date 2020.05.09
 * */
public interface MyArray {
    public void Add(Object Obj);
    public Object Delete(int index);
    public void Change(int index,Object Obj);
    public Object Check(int index);
    public int Size();
    public String ToString();
}
