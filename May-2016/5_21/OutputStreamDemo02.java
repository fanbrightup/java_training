import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
public class OutputStreamDemo02 {
public static void main(String[] args) throws Exception{
    File f = new File("/home/fan/DayCode/5_21/t.txt");
    OutputStream out = null;
    out = new FileOutputStream (f,true);
    String str = "欢迎你们!!!";
    byte[] b =new byte[1024];
    b = str.getBytes();
    for(int i = 0;i<b.length;i++){
      out.write(b[i]);
    }
    out.close();
}
}
