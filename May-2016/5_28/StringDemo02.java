public class StringDemo02{
  public static void main(String[] args) {
    char[] c ={'h','e','l','l','o'};
    byte[] b ={71,72,73,74,75};
    String str =new String(c);
    String str1 = new String(c,3,2);
    String str2 = new String(b);
    String str3 = new String(b,0,2);
    char [] c2 = str.toCharArray();
    byte[] b2 = str.getBytes();
    System.out.println(b2[4]);
    char num = 111;
    String str4 ="  blank space  ";
    System.out.println(str4.substring(4));//substring是小写


  }
}
