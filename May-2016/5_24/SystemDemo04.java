import java.io.InputStream;
public class SystemDemo04{
  public static void main(String[] args)throws Exception {
    InputStream input = System.in;//从键盘接收数据
    byte b[] = new byte[1024];//开辟空间，接收数据
    System.out.print("请输入内容：");//信息提示
    int len = input.read(b);//接收数据
    System.out.println("输入的内容为："+new String(b,0,len));
    input.close();//关闭输入流
  }
}
