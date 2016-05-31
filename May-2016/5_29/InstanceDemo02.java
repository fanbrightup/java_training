class Person{
  private String name;
  private int age;
  public Person(String name,int age){
    this.setName(name);
    this.setAge(age);
  }
  public String getInfo(){
    return "姓名"+this.getName()+"年龄"+this.getAge();
  }
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
  public Student(String name,int age,String school){
    super(name,age);
    this.setSchool(school);
  }
  public String getSchool(){
    return school;
  }
  public void setSchool(String school){
    this.school = school;
  }
}

public class InstanceDemo02{
  public static void main(String[] args) {
    Student stu = new Student("lisi",45,"hope");
    // stu.setName("张三");
    // stu.setAge(30);
    // stu.setSchool("西南民族大学");
    System.out.println("name"+stu.getName()+",年龄"+stu.getAge()
    +",学校"+stu.getSchool());
  }
}
