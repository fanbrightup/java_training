import java.io.*;
public class SerDemo05{
  public static void main(String[] args) {
    Person[] per = {
      new Person("zhangsan",30),new Person("lisi",31),new Person("wangwu",32)};
    }
    ser(per);
    Object [] o = dser();
  }
  public static void ser(Object[] obj) throws Exception{
    File f = new File("/home/fan/t");
    OutputStream oos = null;
    oos = new ObjectOutputStream(out);
    oos.writeObject(obj);
    oos.close();
  }
  public static Object[] dser() throws Exception{
    File f = new File("/home/fan/t");
    ObjectInputStream ois = null;
    InputStream input = new FileInputStream(f);
        // 文件输入流
        ois = new ObjectInputStream(input);
        // 为对象输出流实例化
        Object obj[] = (Object[]) ois.readObject();
        // 读取对象数组
        ois.close();
        // 关闭输出
        return obj;
  }
}
