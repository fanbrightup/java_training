class Person{
  private String name;
  private int age;
  public String getName(){
    return name;
  }
  public void setName(String name){
    this.name = name;
  }
  public int getAge() {
      return age;
  }
  public void setAge(int age) {
      this.age = age;
  }
  }
 class Student extends Person{
  private String school;
  public String getSchool(){
    return school;
  }
  public void setSchool(String school){
    this.school = school;
  }
}
// 关于父类中私有字段子类继承的问题？
//不能继承，子类只能在父类中写一个public的getXXX的方
//法来获取父类中的private属性，子类就调用父类的getXXX来
//获取private属性
// 所以在此例中，stu不能直接访问name和age字段，只能通过方法来访问
public class InstanceDemo{
  public static void main(String[] args) {
    Student stu = new Student();
    stu.setName("张三");
    stu.setAge(30);
    stu.setSchool("西南民族大学");
    System.out.println("name"+stu.getName()+",年龄"+stu.getAge()
    +",学校"+stu.getSchool());
    System.out.println("name=="+ stu.name);
  }
}
