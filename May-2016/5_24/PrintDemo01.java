import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;
public class PrintDemo01{
  public static void main(String[] args)throws Exception{
    PrintStream ps = null;
    //此时通过FileOutputStream实例化，像文件之中打印
    ps = new PrintStream(new FileOutputStream(new File("/home/fan/t")));
    ps.print("hello");
    ps.print("world!!!");
    ps.print("1 + 1 =" +2);
    ps.close();


  }
}
