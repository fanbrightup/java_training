public class ClassDemo04{
  public static void main(String[] args) {
    Person per1 = null;
    Person per2 = null;
    per1 = new Person();
    per2 = new Person();
    per1.name = "张三";
    per1.age = 30;
    per2.name = "李四";
    per2.age = 33;
    System.out.print("per1对象中的内容--->");
    per1.tell();
    System.out.print("per2对象中的内容--->");
    per2.tell();
  }
}
