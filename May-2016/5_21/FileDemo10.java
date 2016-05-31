import java.io.File;
public class FileDemo10 {
public static void main(String args[]) {
  File f = new File("/home/fan/DayCode/5_21/test.txt");
  if(f.isDirectory()){
    System.out.println(f.getPath()+"路径是目录");
  }else{
    System.out.println(f.getPath()+"路径不是目录");
  }
  }
}
