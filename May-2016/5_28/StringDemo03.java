public class StringDemo03{
  public static void main(String[] args) {
    String str1 = "helowloxlerer";
    String str2 = "He";
    int i1 = 5;
    Integer i2 = new Integer(6);
    fun(i2);
     System.out.println(i2);

    // System.out.println(str1.substring(3,6));
    // String[] str2 = str1.split("l");
    // for(String i:str2){
    //   System.out.println(i);
    // }
    // System.out.println(str1.equalsIgnoreCase(str2));
    // System.out.println(str1.replaceAll("l","*"));
    // System.out.println(str1.substring(0,2));
  }

  public static void fun(Integer i){
    i = new Integer(3);
  }
}
