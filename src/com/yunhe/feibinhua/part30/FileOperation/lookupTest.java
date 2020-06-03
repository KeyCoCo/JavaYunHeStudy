package com.yunhe.feibinhua.part30.FileOperation;

/**
 * 主调用方法
 */
public class lookupTest {
    public static void main(String[] args) throws Exception {
        //根据章节生成内容
        lookup look=new lookup();
        look.lookupContent("第三百一十一章");
        //更具内容打印章节
        System.out.println(look.lookupChapter("是"));
    }
}
