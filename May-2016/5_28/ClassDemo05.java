public class ClassDemo05 {
public static void main(String args[]) {
Person per1 = null;
// 声明per1对象
Person per2 = null;
// 声明per2对象
per1 = new Person(); // 只实例化per1一个对象
per2 = per1 ;
// 把per1的堆内存空间使用权给per2
per1.name = "张三";
// 设置per1对象的name属性内容
per1.age = 30;
// 设置per1对象的age属性内容
// 设置per2对象的内容,实际上就是设置per1对象的内容
per2.age = 33;
System.out.print("per1对象中的内容 --> ") ;
per1.tell();
// 调用类中的方法
System.out.print("per2对象中的内容--->");
per2.tell();
}
}
