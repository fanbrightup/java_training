public class NewDemo02{
  public static void main(String[] args) {
    System.out.print("不传递参数(fun()):");
      fun();
      // 不传递参数
      System.out.print("\n传递一个参数(fun(1)):");
      fun(1);
      // 传递一个参数
      System.out.print("\n传递五个参数(fun(1, 2, 3, 4, 5, 6)):");
      fun(1, 2, 3, 4, 5, 6);
      // 传递五个参数
      }

    public static void fun(int...arg){
      for(int x : arg){
        System.out.print(x + "、");
      }
    
  }
}
