import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;
public class SystemDemo06 {
public static void main(String[] args) throws Exception{
  System.setOut(new PrintStream(new FileOutputStream("/home/fan/t",true)));//System.out输出重定向
  System.out.print("www.okfcm.win");//输出时，不再向屏幕上输出，而是向指定的重定向位置输出
  System.out.println(",fan");
}
}
