package com.example.taojun.neteasecloudmusic.activity;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test {
    private static final String regex = ".+(.JPEG|.jpeg|.JPG|.jpg|.png)$";//正则表达式 用来判读是否是图片格式的文件
    private static final String srcPath = "C:\\Users\\TJ\\Desktop\\CloudMusic_official_5.7.0.700040"; // 需要查找的文件夹
    private static final String targetPath = "C:\\Users\\TJ\\Desktop\\images"; // 存放的目标文件夹


    public static void main(String[] args) throws IOException {
        File file = new File(srcPath);
        copyPhoto(file);
        System.out.println("传输完成!");
    }

    private static void copyPhoto(File file) throws IOException {  //复制图片的方法
        File[] files = file.listFiles(); //将路径封装成File数组
        for (File file2 : files) {//遍历这个数组
            if (file2.isDirectory()) { //判断是否是文件夹
                copyPhoto(file2);  //是的话就继续调用这个方法
            } else if (file2.getName().matches(regex)) { //不是的话就匹配是否是图片
                BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file2));//创建输入的管道
                byte[] buf = new byte[1024 * 20];//创建一个小数组
                int lenght = 0;
                BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(  //创建输出管道
                        targetPath + "\\" + file2.getName())); //图片会拷贝到这里
                while ((lenght = bis.read(buf)) != -1) {
                    bos.write(buf, 0, lenght);
                }
                bos.close();
                bis.close();
            }
        }
    }
}
