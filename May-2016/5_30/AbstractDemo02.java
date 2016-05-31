abstract class A{
  public static final String FLAG = "CHINA";
  private String name = "范";
  public String getName(){
    return name;
  }
  public void setName(String name){
    this.name = name;
  };
  public abstract void print();// 定义抽象方法
};
class B extends A{
  public void print(){
    System.out.println("FLAG="+FLAG);
    System.out.println("name = "+super.getName());
  }
}
public class AbstractDemo02{
  public static void main(String[] args) {
    B b = new B();// 实例化子类对象
    b.print();// 调用被子类覆写过的方法
  }
}
