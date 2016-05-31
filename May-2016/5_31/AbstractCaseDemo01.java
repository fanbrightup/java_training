abstract class A {
  public abstract void print();
}
class B extends A{
  public void print(){
    System.out.println("Hello world?");
  }
}
public class AbstractCaseDemo01{
  public static void main(String[] args) {
    A a = new B();
    a.print();
  }
}
