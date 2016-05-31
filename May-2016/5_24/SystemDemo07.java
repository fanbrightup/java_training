import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
public class SystemDemo07 {
public static void main(String[] args) {
    String str = "hello";//声明一个非数字的字符串
    try{
      System.out.println(Integer.parseInt(str));
    }catch (Exception e){
      try{
        //输出重定向
        System.setOut(new PrintStream(new FileOutputStream("/home/fan/t")));
      }catch (FileNotFoundException e1){
        e1.printStackTrace();
      }
      System.out.println(e);//输出错误，保存文件之中
    }

}


}
