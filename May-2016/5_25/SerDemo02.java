import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
public class SerDemo02{
  public static void main(String[] args) throws Exception {
    File f = new File("/home/fan/t");
    ObjectInputStream ois = null;
    InputStream input = new FileInputStream(f);//文件输入流
    ois = new ObjectInputStream(input);//为对象输出流实例化
    Object obj = ois.readObject();//读取对象
    ois.close();//关闭输出
    System.out.println(obj);
  }
}
