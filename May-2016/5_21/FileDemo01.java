import java.io.File;
import java.io.IOException;
public class FileDemo01{
	public static void main(String [] args){
	File f = new File("/home/fan/DayCode/day5_21/test.txt");
	try{
		f.createNewFile();
	}catch (IOException e){
	e.printStackTrace();

}
}
}
