import java.io.ByteArrayInputStream;
import java.io.PushbackInputStream;
import java.io.*;
public class PushInputStreamDemo{
  public static void main(String[] args)throws Exception {
    String str = "www.okfcm.win";
    PushbackInputStream push = null;
    ByteArrayInputStream bai = null;
    bai = new ByteArrayInputStream(str.getBytes());
    push = new PushbackInputStream(bai);
    System.out.print("读取之后的数据为：");
    int temp = 0;
    while((temp = push.read()) != -1){
      if(temp == '.'){
        push.unread(temp);
        temp = push.read();
        // System.out.print("(退回"+(char)temp+")");
      }else{
        System.out.print((char)temp);
      }
    }
  }
}
