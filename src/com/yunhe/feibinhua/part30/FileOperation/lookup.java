package com.yunhe.feibinhua.part30.FileOperation;

import java.io.*;

/**
 * 小说的读写
 */
public class lookup {
    private final File F=new File("D:\\Java_code\\Java_Learn\\src\\com\\yunhe\\FeiBinHua\\part30\\小说\\五行天[bookben.net].txt");

    /**
     * @param title 章节标题
     * @throws IOException
     */
    public void lookupContent(String title) throws IOException {
        File[] files=F.listFiles();
        String str="";
        for(File s:files){
            if(s.getName().contains(title)){
                File temfile=new File("D:\\Java_code\\Java_Learn\\src\\com\\yunhe\\FeiBinHua\\part30\\临时储存\\"+s.getName());
                if(!temfile.exists()){
                    temfile.getParentFile().mkdirs();
                    temfile.createNewFile();
                }
                BufferedReader br=new BufferedReader(new FileReader(s));
                while ((str=br.readLine())!=null){
                    BufferedWriter bw=new BufferedWriter(new FileWriter(temfile,true));
                    bw.write(str);
                    bw.newLine();
                    bw.flush();
                    bw.close();
                }
            }
        }
    }

    /**
     *
     * @param 文章内容
     * @return  章节标题
     * @throws Exception
     */
    public String lookupChapter(String content) throws Exception{
        String str="查找失败";
        File [] files=F.listFiles();
        String st=null;
        for(File fs:files){
            BufferedReader br=new BufferedReader(new FileReader(fs));
            while ((st=br.readLine())!=null){
                if(st.contains(content)){
                    str=fs.getName();
                }
            }
        }
        return str;
    }
}
