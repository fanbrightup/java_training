class A{
  public void fun1(){
    System.out.println("A-->public void fun1(){}");
  }
  public void fun2(){
    this.fun1();
  }
};
class B extends A{
  public void fun1(){
    System.out.println("B-->public void fun1()");
  }
  public void fun3(){
    System.out.println("B-->public void fun3()");
  }
}
public class PolDemo01{
  public static void main(String[] args) {
    // B b = new B();
    // A a = b; // 向上转型
    // a.fun1();// 方法fun1被覆写了，所以执行B中方法
    A a = new B();//  在进行对象的向下转型之前,必须首先发生对象向上
                    //  转型才可以,否则将出现对象转换异常
    B b = (B)a;
    b.fun1();
    b.fun2();// 调用父类方法，但执行B中的fun1()方法
    b.fun3();
  }
}
