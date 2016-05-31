import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;
public class PrintDemo02{
  public static void main(String[] args)throws Exception{
    PrintStream ps = null;
    //此时通过FileOutputStream实例化，意味着所有的输出是向文件之中打印
    ps = new PrintStream(new FileOutputStream(new File("/home/fan/t")));
    String name = "李";
    int age = 30;
    float score = 900.356f;
    char sex = 'M';

    ps.printf("姓名：%s：年龄：%s：成绩：%s：姓名：%s",name,age,score,sex);
    ps.close();
  }
}
