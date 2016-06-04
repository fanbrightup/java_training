//package first;
class Person{
  private String name;
  private int age;
  public Person(String name,int age){
    this.name = name;
    this.age = age;
  }
  public String toString (){
    return "姓名："+this.name+":年龄："+this.age;
  }
}
public class ObjectDemo02{
  public static void main(String[] args) {
    Person per = new Person("李兴华" , 30);//实例化Person对象
    System.out.println("对象信息：" + per);//打印对象调用toString ()方法
  }
}
