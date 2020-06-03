package com.yunhe.feibinhua.part31;

import java.io.*;

/** 查找关键字 */
public class lookupCharNums {
  protected int charNums, chapterNums, lineNums;

  /**
   * @param str 关键字
   * @throws Exception
   */
  public void searchChar(String str) throws Exception {
    File f = new File(".\\src\\com\\yunhe\\FeiBinHua\\part30\\小说\\五行天[bookben.net].txt");
    File[] files = f.listFiles();
    for (File file : files) {
      BufferedReader br = new BufferedReader(new FileReader(file));
      String st = "";
      while ((st = br.readLine()) != null) {
        if (st.contains(str)) {
          lineNums++;
          for (int i = 0; i < st.length() - str.length(); i++) {
            if (str.equals(st.substring(i, i + str.length()))) {
              charNums++;
              chapterNums++;
            }
          }
        }
      }
      if (chapterNums != 0) {
        System.out.println(file.getName() + "中有关键字" + chapterNums + "个");
        chapterNums = 0;
      }
    }
  }
}
