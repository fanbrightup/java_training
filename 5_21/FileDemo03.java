import java.io.File;
import java.io.IOException;
public class FileDemo03{
	public static void main(String [] args){
		String path = "/home/fan/DayCode/5_21/te.txt";
		File f = new File(path);
		try{ 
			f.createNewFile();
		}catch(IOException e){
			e.printStackTrace();	
}

}
}
