import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
public class InputStreamDemo04{
  public static void  main(String[] args) throws Exception{
    File f = new File("/home/fan/DayCode/5_21/t.txt");
    InputStream input = null;
    input = new FileInputStream(f);
    byte b[] = new byte[(int)f.length()];
    for(int i = 0;i<b.length;i++){
        b[i] = (byte)input.read();
    }
    input.close();
    System.out.println("内容为："+ new String(b));
    System.out.println("长度为："+b.length);
  }
}
