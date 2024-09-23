package iotest;

import java.io.FileOutputStream;
import java.io.IOException;

public class Demo_2 {
    public static void main(String[] args) throws IOException {
        //路径和file对象都可以
        //要保证父路径在。会创建文件
        //已有会清空再写入
        FileOutputStream a = new FileOutputStream("E:\\zhuomian\\javageiqianla\\shuanfa\\untitled2\\src\\main\\java\\iotest\\a.txt");
        //sacll编码
        a.write(99);
        //释放资源
        a.close();
    }
}
