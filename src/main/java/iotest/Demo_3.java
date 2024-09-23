package iotest;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class Demo_3 {
    public static void main(String[] args) throws IOException {
        //路径和file对象都可以
        //要保证父路径在。会创建文件
        //已有会清空再写入
        Demo_3 a = new Demo_3();
        a.write();


    }
    public void read() throws IOException {
        FileOutputStream a = new FileOutputStream("E:\\zhuomian\\javageiqianla\\shuanfa\\untitled2\\src\\main\\java\\iotest\\a.txt");
        //FileOutputStream a = new FileOutputStream("E:\\zhuomian\\javageiqianla\\shuanfa\\untitled2\\src\\main\\java\\iotest\\a.txt",true);
        String d = "jfajslk";
        byte[] bytes = d.getBytes();
        System.out.println(Arrays.toString(bytes));

        //sacll编码
        a.write(bytes);
        //释放资源
        a.close();
    }
    public void write() throws IOException {
        FileInputStream b = new FileInputStream("E:\\zhuomian\\javageiqianla\\shuanfa\\untitled2\\src\\main\\java\\iotest\\a.txt");
        byte[] g = b.readAllBytes();
        String c = Arrays.toString(g);

        System.out.println(c);

    }

}
