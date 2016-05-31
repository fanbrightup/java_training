class Demo{
  {
    System.out.println("hello world");
  }
  static {
    System.out.println("你好");
  }
  private Demo(){
    System.out.println("2,构造方法");
  }
}
public class CodeDemo03{
  static{
    System.out.println("在主方法所定义的代码块");
  }
  public CodeDemo03(){
    System.out.println("---在主类中的构造");
  }
  public static void main(String[] args) {
    new Demo();
    new Demo();
    new Demo();
    new CodeDemo03();
  }
}
