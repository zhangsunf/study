package iotest;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class copyfile {
    public static void main(String[] args) throws IOException {
        copya();

    }
    public static void copy() throws IOException {
        //创建对象
        FileInputStream a = new FileInputStream("E:\\zhuomian\\javageiqianla\\shuanfa\\untitled2\\src\\main\\java\\iotest\\a.txt");
        FileOutputStream b = new FileOutputStream("E:\\zhuomian\\javageiqianla\\shuanfa\\untitled2\\src\\main\\java\\iotest\\c.txt");
        //copy
        int c;
        while ((c = a.read()) != -1){
            b.write(c);
        }
        //释放
        a.close();
        b.close();
    }
    public static void copya() throws IOException {
        //创建对象
        FileInputStream a = new FileInputStream("E:\\zhuomian\\javageiqianla\\shuanfa\\untitled2\\src\\main\\java\\iotest\\a.txt");
        FileOutputStream b = new FileOutputStream("E:\\zhuomian\\javageiqianla\\shuanfa\\untitled2\\src\\main\\java\\iotest\\c.txt");
        //copy
        byte[] c = new byte[20];
        int g =a.read(c);
        System.out.println(g);
        b.write(c);
        //释放
        a.close();
        b.close();
    }

}
