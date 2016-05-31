class Person{
  public String info = "MLDN";
}
class Student extends Person{
  public String info = "li";
  public void print(){
    System.out.println("父类中"+super.info);
    System.out.println("子类中"+this.info);
  }
}
public class OverrideDemo05{
  public static void main(String[] args) {
    new Student().print();
  }
}
