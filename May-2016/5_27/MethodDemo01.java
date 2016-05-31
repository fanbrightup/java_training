public class MethodDemo01{
  public static void main(String[] args) {
    printInfo();
    printInfo();
    printInfo();
    System.out.println("Hello world!");
  }

  public static void printInfo(){
    char c[] = {'H','e','l','l','o',
        ',','L','X','H'};
        // 定义一个字符数组
        for (int x = 0; x < c.length; x++) {
        // 循环输出
        System.out.print(c[x]) ;
        }
        System.out.println("") ;
        // 换行
  }
}
