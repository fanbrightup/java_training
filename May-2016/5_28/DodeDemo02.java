class Demo{
  {
    System.out.println("1,构造块。");
  }
  public Demo(){
    System.out.println("2,构造方法");
  }
}
public class CodeDemo02{
  public static void main(String[] args) {
    new Demo();
    new Demo();
    new Demo();
  }
}
