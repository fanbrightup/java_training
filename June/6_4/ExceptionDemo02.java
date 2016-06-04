public class ExceptionDemo02{
  public static void main(String[] args) {
    System.out.println("*******计算开始*******");
    int i = 10;
    int j = 0;
    try{
      int temp = i/j;
      System.out.println("两数相除结果:"+temp);
      System.out.println("------------------");
    }catch(ArithmeticException e){
      System.out.println("出现异常了："+e);
    }finally{
      System.out.println("不管是否出现异常，都执行此代码");
    }
    System.out.println("*********计算结束***********");
  }
}
