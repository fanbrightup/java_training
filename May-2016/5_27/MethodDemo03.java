public class MethodDemo03 {
public static void main(String[] args) {
int one = add(10, 20);
// 调用有两个参数的整型加法
int two = add(10, 20, 30);
// 调用有三个参数的整型加法
float three = add(10f, 13f);
// 调用有两个参数的浮点型加法
System.out.println("add(int x, int y)的计算结果:" + one) ;
System.out.println("add(int x, int y, int z)的计算结果:" + two);
System.out.println("add(float x, float y)的计算结果:" + three);
}
public static int add(int x, int y) {
// 定义add方法,完成两个整数相加
int temp = 0;
// 定义局部变量
temp = x + y;
// 执行加法计算
return temp;
// 返回计算结果
}
public static int add(int x, int y, int z) { // 定义add方法,完成三个整数相加
int temp = 0;
// 定义局部变量
temp = x + y + z;
// 执行加法操作
return temp;
// 返回计算结果
}
public static float add(float x, float y) { // 定义add方法,完成两个浮点数相加
float temp = 0;
// 定义局部变量
temp = x + y;
// 执行加法操作
return temp;
// 返回计算结果
}
}
