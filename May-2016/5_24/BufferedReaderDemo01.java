import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class BufferedReaderDemo01{
  public static void main(String[] args) {
    BufferedReader buf = null;
    buf = new BufferebdReader(new InputStreamReader(System.in));
    String str = null;
    System.out.prinft("请输入内容:");
    try{
      str = buf.readLine();
    }catch (IOException e){
      e.printStackTrace();
    }
    System.out.println("输入的内容为："+str);
  }
}
