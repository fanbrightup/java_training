class Person {
private String name;
// 姓名属性
public Person(String name) {
// 通过构造方法设置内容
this.name = name;
// 为姓名赋值
}
public String getName() {
// 取得姓名
return this.name;
}
}
public class ObjectArrayDemo02 {
public static void main(String args[]) {
// 声明一个对象数组,里面有三个对象,使用静态初始化方式
Person per[] = { new Person("张三"), new Person("李四"), new Person("王五") };
System.out.println("================ 数组输出 ================");
for (int x = 0; x < per.length; x++) { // 循环输出
System.out.print(per[x].getName() + "、");
}
}
}
