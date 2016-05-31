import java.io.File;
import java.io.FileWriter;
import java.io.Writer;
public class WriterDemo01{
  public static void main(String[] args) throws Exception{
    File f = new File("/home/fan/DayCode/5_21/t.txt");
    Writer out = null;
    out = new FileWriter(f,true);
    String str = "\r\n测试r5";
    out.write(str);
    out.close();
  }
}
