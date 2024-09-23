package com.zhang.javaee;
/*异常
* Java异常顶级父类Throwable
* Exception
*   RunTimeException：运行时错误
*   CheckException；检查异常编译不通过
* Error 程序无法处理的错误会停止运行
* */


/*throw：在方法内，抛出具体异常，可以处理可以不处理在方法体内处理，一定抛出异常
*throws：在方法声明上，表示抛出异常，由调用者处理，不一定有异常
* */

/*
* 常见的异常类
* Null
* SQL
* index
* fileNot
* io
* class转换异常
* noSuch
* number
* lllegal
* arithmetic*/
public class Throwable {
    public static void method() {
        int a = 50;
        int b = 0;
        if (b == 0) {
            throw new RuntimeException("不能为0");
        }else {
            System.out.println("nb");
        }
    }
    public static void meth() throws Exception{
        int a = 50;
        int b = 0;
        if (b == 0) {
            throw new RuntimeException("不能为0");
        }else {
            System.out.println("nb");
        }
    }
}

