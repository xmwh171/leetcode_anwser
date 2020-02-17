package com.zhou.leetcode_anwser.test;

import org.springframework.util.NumberUtils;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @Description
 * @Author xiaohu
 * @Date 2020/2/14 17:20
 */
public class FileBatchCreate {

    public static void createFile(String fromPath,String toPath) throws IOException {
        File file = new File(fromPath);
        String[] filelist = file.list();
        List<Integer> numberList = new ArrayList<Integer>();
        for (int i = 0; i < filelist.length; i++) {
            String number = filelist[i].replace("Question","").replace(".java","");
            numberList.add(Integer.parseInt(number));
        }
        for(int i=1;i<=1350;i++){
            if(!numberList.contains(i)){
                System.out.println(i);
                File file2 = new File(toPath+"\\Question"+i+".java");
                file2.createNewFile();
                BufferedWriter bw = new BufferedWriter(new FileWriter(file2));
                bw.write("package com.zhou.leetcode_anwser.other;");
                bw.newLine(); bw.newLine();
                bw.write("/**");
                bw.newLine();
                bw.write(" *");
                bw.newLine();
                bw.write(" */");
                bw.newLine();
                bw.write("public class Question"+i+"{");
                bw.newLine(); bw.newLine(); bw.newLine(); bw.newLine();
                bw.write("   public static void main(String[] args) {");
                bw.newLine(); bw.newLine();
                bw.write("   }");
                bw.newLine(); bw.newLine();
                bw.write("}");
                bw.close();
            }
        }
    }

    public static void main(String[] args) throws Exception {
        //  System.out.println(readfile("E:\\program\\leetcode_anwser\\src\\main\\java\\com\\zhou\\leetcode_anwser\\interview"));
        createFile("E:\\program\\leetcode_anwser\\src\\main\\java\\com\\zhou\\leetcode_anwser\\interview","E:\\program\\leetcode_anwser\\src\\main\\java\\com\\zhou\\leetcode_anwser\\other");
    }

    /**
     * 读取某个文件夹下的所有文件
     */
    public static boolean readfile(String filepath) throws FileNotFoundException, IOException {
        try {

            File file = new File(filepath);
            if (!file.isDirectory()) {
                System.out.println("文件");
                System.out.println("path=" + file.getPath());
                System.out.println("absolutepath=" + file.getAbsolutePath());
                System.out.println("name=" + file.getName());

            } else if (file.isDirectory()) {
                System.out.println("文件夹");
                String[] filelist = file.list();
                for (int i = 0; i < filelist.length; i++) {
                    File readfile = new File(filepath + "\\" + filelist[i]);
                    if (!readfile.isDirectory()) {
                        System.out.println("path=" + readfile.getPath());
                        System.out.println("absolutepath="
                                + readfile.getAbsolutePath());
                        System.out.println("name=" + readfile.getName());

                    } else if (readfile.isDirectory()) {
                        readfile(filepath + "\\" + filelist[i]);
                    }
                }

            }

        } catch (FileNotFoundException e) {
            System.out.println("readfile()   Exception:" + e.getMessage());
        }
        return true;
    }




}
