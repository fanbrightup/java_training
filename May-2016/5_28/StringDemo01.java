public class StringDemo01{
  public static void main(String[] args) {
    // String name = "zhangsan";
    // String name2 = "zhangsan";
    //
    // System.out.println("姓名"+name);
    //
    // String name3 = new String("zhangsan");
    // System.out.println("姓名2："+name2);
    //
    // System.out.println(name == name3);
    // System.out.println(name == name2);
    // System.out.println("\"hello\" equals \"hello\" --> "
    // + ("hello".equals("hello")));
    StringBuffer str1 = new StringBuffer("\t");
      for (int i = 0; i < 100; i++) {
      str1.append(i+"\t");
      }
      System.out.println(str1);

    // String str = "hello";
    // String str1 = "hello";
    // String str2 =str + "hello";
    // System.out.println("str = "+str.hashCode());
    // System.out.println("str2 = "+str2.hashCode());
    // System.out.println("str1 = "+str1.hashCode());



  }
}
