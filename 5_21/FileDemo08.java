import java.io.File;
public class FileDemo08 {
public static void main(String args[]) {
  File f = new File("/");
  File [] listFiles = f.listFiles();
  for (int i = 0; i< listFile.length;i++){
      System.out.print(listFile[i]+"\t");
  }
}
}
