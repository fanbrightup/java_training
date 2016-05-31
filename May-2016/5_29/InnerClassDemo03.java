class Outer{
  private static String info = "hello world!!!";
  static class Inner{
    public void print(){
      System.out.println(info);
    }
  }
}
public class InnerClassDemo03{
  public static void main(String[] args) {
    new Outer.Inner().print();
  }
}
