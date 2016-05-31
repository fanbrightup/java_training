import java.io.*;
public class SystemDemo02{
  public static void main(String [] args){
  String str = "hello";     //声明一个非数字的字符串
  try{
    System.out.println(Integer.parseInt(str));
  }catch(Exception e){
    System.err.println(e);
  }
}
}
