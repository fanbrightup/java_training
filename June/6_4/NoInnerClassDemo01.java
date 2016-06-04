
interface A{    //  定义接口A
  public void printInfo();//  定义抽象方法
}
class B implements A{ //  定义接口实现类
  public void printInfo(){//  覆写抽象方法
    System.out.println("Hello world");
  }
}
class X{    //  定义X类
  public void fun1(){ //  定义fun1（）方法
    this.fun2(new B());// 传递子类实例

  }
  public void fun2(A a){  //  接收接口实例
    a.printInfo();    //  调用接口方法
  }
}
public class NoInnerClassDemo01{
  public static void main(String[] args) {
    new X().fun1(); //  实例化X类对象并调用fun1（）方法
  }
}
