class Person{
  String name;
  int age;
  public void tell(){
    System.out.println("姓名："+name+",年龄:"+age);
  }
}

public class ClassDemo03{
  public static void main(String[] args) {
    Person per = new Person();
    per.name = "张三";
    per.age = 30;
    Person per2 =null;
    per2 = per;
    per2.name = "李四";
    per.tell();
  }
}
