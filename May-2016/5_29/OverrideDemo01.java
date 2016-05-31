class Person{
private  void print(){
    System.out.println("Person--> void print(){}");
  }
}
class Student extends Person{
  public void print(){
    // super.print();
    System.out.println("Student --> void print(){}");
  }
}
public class OverrideDemo01{
  public static void main(String[] args) {
    new Student().print();
  }
}
