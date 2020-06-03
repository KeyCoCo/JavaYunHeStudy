package com.yunhe.feibinhua.part26;

import java.io.File;
import java.io.IOException;

/**
 * File类的使用
 *
 * @author 费斌华
 * @date 2020.5.13
 */
public class FileTest {
  protected File f1 = new File("D:/Java_code/Java_Learn/src/com/yunhe/FeiBinHua/part26/a");
  protected File f2 = new File("D:/Java_code/Java_Learn/src/com/yunhe/FeiBinHua/part26/b.txt");

  public static void main(String[] args) throws IOException { // 抛出IO异常
    FileTest f = new FileTest();
    f.mkdirTest();
    f.fileTest();
  }

  public void mkdirTest() {
    // System.out.println(f1.mkdir());//创建指定目录若父级目录不存在则返回false不创建
    if (f1.exists()) {
      // 判断文件夹或文件是否存在
      System.out.println(f1.delete());
    } else {
      System.out.println(f1.mkdirs());
      // 创建指定目录若父级目录不存在则返回true并创建所以不存在的指定目录
    }
  }

  public void fileTest() throws IOException {
    if (f2.isFile()) { // 判断文件是否存在
      f2.delete();
    } else {
      f2.createNewFile();
    }
  }
}
