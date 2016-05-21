import java.io.File;
import java.io.FileReader;
import java.io.Reader;
public class ReaderDemo01{
  public static void main(String[] args) throws Exception{
    File f = new File("/home/fan//DayCode/5_21/t.txt");
    Reader reader = null;
    reader = new FileReader(f);
    char c[] = new char[2048];
    int len = 0;
    int temp = 0 ;
    while((temp = reader.read()) != -1){// \r会被认为是文件结束，后边都不读取。
      c[len] = (char) temp;
      len ++;
    }
    reader.close();
    System.out.println("内容为:"+new String(c,0,len));
  }
}
