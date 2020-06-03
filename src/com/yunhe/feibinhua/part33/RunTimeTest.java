package com.yunhe.feibinhua.part33;

/** @author KeyHack */
public class RunTimeTest {
  public static void main(String[] args) throws Exception {
    Runtime run = Runtime.getRuntime();
    // run.exec("shutdown -s -t 8000");关机命令
    run.exec("shutdown -a");
    // 取消关机命令
  }
}
