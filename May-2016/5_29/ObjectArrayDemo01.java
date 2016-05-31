class Person{
  private String name;
  public Person(String name){
    this.name = name;
  }
  public String getName(){
    return this.name;
  }
}
public class ObjectArrayDemo01{
  public static void main(String[] args) {
    Person per[] = new Person[3];
    System.out.println("==========数组声明=========");
    for(int x = 0;x<per.length;x++){
      System.out.println(per[x]+"..");
    }
    per[0] = new Person("zhangsan");
    per[1] = new Person("lisi");
    per[2] = new Person("wangwu");
    for(int x = 0;x<per.length;x++){
      System.out.println(per[x].getName()+"..");
    }
  }
}
