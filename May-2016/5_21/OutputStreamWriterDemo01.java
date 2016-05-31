import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
public class OutputStreamWriterDemo01{
  public static void main(String[] args)throws Exception{
    File f = new File("/home/fan/DayCode/5_21/t.txt");
    Writer out = null;
    out  = new OutputStreamWriter(new FileOutputStream(f));
    out.write("Hello world");
    out.close();
  }
}
