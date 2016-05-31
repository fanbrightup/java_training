interface  A {
  public abstract void print();
}
class B implements A{
  public void print(){
    System.out.println("Hello world?");
  }
}
public class InterfaceCaseDemo01{
  public static void main(String[] args) {
    A a = new B();
    a.print();
  }
}
