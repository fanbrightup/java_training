import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
public class OutputStreamDemo01 {
public static void main(String[] args) throws Exception{
    File f = new File("/home/fan/DayCode/5_21/t.txt");
    OutputStream out = null;
    out = new FileOutputStream (f);
    String str = "hello world!";
    byte[] b =new byte[1024];
    b = str.getBytes();
    out.write(b);
    out.close();
}
}
