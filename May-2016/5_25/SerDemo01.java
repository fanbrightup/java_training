import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
public class SerDemo01{
  public static void main(String[] args)throws Exception {
    File f = new File("/home/fan/t");
    ObjectOutputStream oos = null;
    OutputStream out  = new FileOutputStream(f);//文件输入流
    oos = new ObjectOutputStream(out);//为对象输出流实例化
    oos.writeObject(new Person("张三",30));//保存对象到文件
    oos.close();//关闭输出

  }
}
