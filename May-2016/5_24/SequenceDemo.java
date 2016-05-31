import java.io.*;
public class SequenceDemo{
  public static void main(String[] args)throws IOException{
    InputStream is1 = null;
    InputStream is2 = null;
    OutputStream os = null;
    SequenceInputStream sis = null;
    is1 = new FileInputStream("/home/fan/t1");//输入流1
    is2 = new FileInputStream("/home/fan/t2");//输入流2
    os = new FileOutputStream("/home/fan/t");//输出流
    sis = new SequenceInputStream(is1,is2);//实例化合并流
    int temp = 0;
    while((temp = sis.read())!=-1){//循环输出
      os.write(temp);
    }
    sis.close();//关闭合并流
    is1.close();//关闭输入流1
    is2.close();//关闭输入流2
    os.close();//关闭输出流
  }
}
