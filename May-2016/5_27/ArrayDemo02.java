public class ArrayDemo02{
  public static void main(String[] args) {
    int[] score = null; //先让他指向空
    score = new int[3];
    for(int x = 0;x < 3;x++){
      score[x] = x*2 +1;
    }
    for(int x = 0;x < 3;x++){
      System.out.println("score["+x+"]"+score[x]);

    }
    String str = "hello";
    System.out.println("数组长度为："+str.length());
  }
}
