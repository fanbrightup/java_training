import java.io.File;
public class FileDemo07 {
public static void main(String args[]) {
File f = new File("/home/fan/DayCode/5_21/t"); // 给出路径
// f.mkdirs();
// try{
//   f.createNewFile();
// }catch (Exception e){
//   e.printStackTrace();
// }
boolean br = f.renameTo(new File("/home/fan/DayCode/5_21/ss"));
System.out.println(f.getName());
// 创建文件夹
System.out.println("heheh");
f.delete();
System.out.println(br);
}
}
