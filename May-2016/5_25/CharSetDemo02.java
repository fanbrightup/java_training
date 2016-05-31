import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
public class CharSetDemo02{
  public static void main(String[] args)throws Exception  {
    File f = new File("/home/fan/t");
    OutputStream out  = new FileOutputStream(f);//实例化输出流
    byte b[] = "中国，你好！".getBytes("uTf-8");//指定编码格式
    out.write(b); //保存转码之后的数据
    out.close(); //关闭输出流
  }
}
