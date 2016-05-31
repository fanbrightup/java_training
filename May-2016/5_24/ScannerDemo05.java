import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class ScannerDemo05{
  public static void main(String[] args) {
    File f = new File("/home/fan/t");//指定操作文件
    Scanner scan = null;
    try{
      scan = new Scanner(f);//从文件接收数据
    }catch (FileNotFoundException e){
      e.printStackTrace();
    }
    StringBuffer str = new StringBuffer();//用于接收数据
    while(scan.hasNext()){    //判断是否还有内容
      str.append(scan.next()).append("\n");//取出内容
    }
    System.out.println(str);
  }
}
