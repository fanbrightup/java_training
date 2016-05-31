import java.io.Serializable;
public class Person implements Serializable{//此类的对象可以被序列化
  private transient  String name;   //此属性将不被序列化
  private int age;                  //此属性将被序列化
  public Person(String name,int age){
    this.name = name;
    this.age = age;
  }
  public String toString(){ //覆盖toString(),输出信息
    return "姓名：" + this.name +"：年龄" + this.age;
  }
}
