import java.io.File;
public class FileDemo05{
	public static void main(String args[]) throws Exception{
	File f = new File("/home/fan/DayCode/5_21/test.txt");
  if(f.exists()){
    f.delete();
  }else{
    f.createNewFile();
  }
}
}
