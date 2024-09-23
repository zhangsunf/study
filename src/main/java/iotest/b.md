io流读写
file：表示文件或者文件路径 文件信息  文件增删改查
io：网络或者文件内数据操作output,input程序为参照
分类(抽象类)
字节流：所有文件
    输入InputStream：FileInputStream
    输出OutputStream：
字符流：纯文本文件（记事本可以读懂的）
    输入Reader：
    输出Writer：
释放资源
close();
接口AutoCloseable不同版本不一样
创建流1，2
在try（流1;流2）{
} catch{
}finally{
}
资源用完自动释放在jdk9中

乱码原因（字符集） 读取不完整？编码格式
计算机二进制存储bit 8 = 字节 1;
字符集：ASCII,GBK(中),Unicode（中）
编码
String str = "nhao";
byte[] a = str.getBytes("GBK");
s.o.p(Arrays.toString(a));

解码
String b = new String(a);
s.o.p(b);

字符流 = 字节流 + 字符集

高级流（底层还是基本流）
缓冲流；BufferedInputStream 提供高性能缓冲区
转换流：是字符流和字节流中间的桥InputStreamReader，OutputStreamWriter 
序列化流（对象操作流）：可以Java对象写在本地文件（加密）public ObjectOutputStream(OutputStream out);
反序列化流：
打印流（分字符流和字节流）：不能读只能写只能操作目的地不能操作数据 PrintStream（）；printWriter（）
压缩流和解压缩流：

commons-io  是io操作的工具包提高效率
导入jar包
在lib中存放第三方jar 右键点击jar包 add as Library》ok
在类中导包
FileUtils类
IOUtils类


Hutool工具包
