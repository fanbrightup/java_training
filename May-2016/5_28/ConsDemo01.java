public class ConsDemo01{
  public static void main(String[] args) {
    System.out.println("声明对象");
    Person per = null;
    System.out.println("实例化");
    new Person("zhangsan",30).tell();//只使用一次，只存在于堆内存中，而不存在栈内存的引用
  }
}
