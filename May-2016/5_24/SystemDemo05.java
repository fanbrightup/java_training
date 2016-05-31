import java.io.InputStream;
public class SystemDemo05{
  public static void main(String[] args) throws Exception{
    InputStream input = System.in;//通过键盘接收数据
    StringBuffer buf = new StringBuffer();//声明StringBuffer用于接收数据
    System.out.print("请输入内容：");
    int temp = 0;
    while((temp = input.read())!=-1){//循环接收
      char c = (char) temp;//将数据变为字符
      if(c == '\n'){
        break;//退出循环，输入回车表示输入完成
      }
      buf.append(c);//追加数据
    }
    System.out.println("输入的内容为："+buf);
    input.close();//关闭输入流
  }
}
