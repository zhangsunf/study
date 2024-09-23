package iotest;

import java.io.FileOutputStream;
import java.io.IOException;

public class Demo_1 {
    public static void main(String[] args) throws IOException {
        FileOutputStream a = new FileOutputStream("E:\\zhuomian\\javageiqianla\\shuanfa\\untitled2\\src\\main\\java\\iotest\\a.txt");
        a.write(99);
        //释放资源
        a.close();
    }
}
