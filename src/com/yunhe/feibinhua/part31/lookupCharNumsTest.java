package com.yunhe.feibinhua.part31;

/** 关键字查找 */
public class lookupCharNumsTest {
  public static void main(String[] args) throws Exception {
    lookupCharNums lookup = new lookupCharNums();
    lookup.searchChar("已经");
    System.out.println("关键字段在本文中出现了" + lookup.lineNums + "行");
    System.out.println("关键字段在本文中出现了" + lookup.charNums + "次");
  }
}
