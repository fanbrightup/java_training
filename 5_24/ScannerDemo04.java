import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class ScannerDemo04 {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in); // 从键盘接收数据
System.out.print("输入日期(yyyy-MM-dd):");
String str = null;
Date date = null ;
if (scan.hasNext("^\\d{4}-\\d{2}-\\d{2}$")) {// 判断输入格式是否是日期
str = scan.next("^\\d{4}-\\d{2}-\\d{2}$");
// 接收日期格式的字符串
try {
// 转换成日期
date = new SimpleDateFormat("yyyy-MM-dd").parse(str) ;
} catch (ParseException e) {
e.printStackTrace();
}
}else{
System.out.println("输入的日期格式错误!");
}
System.out.println(date);
}
}
