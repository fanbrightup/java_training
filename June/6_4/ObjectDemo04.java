interface A{
  public String getInfo();
}
class B implements A{
  public String getInfo(){
    return "Hello World~";
  }
}
public class ObjectDemo04{
  public static void main(String[] args) {
    A a = new B();  //  为接口实例化
    Object obj = a; //  对象向上转型
    A x = (A)obj;// 对象向下转型
    System.out.println(x.getInfo());
  }
}
