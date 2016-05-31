import java.util.Random;
public class RandomDemo01{
  public static void main(String[] args) {
    int i =20;
    while(i<0){
      i--;
    int number =  new Random().nextInt(5);
    System.out.println(number);
  }
}
}
