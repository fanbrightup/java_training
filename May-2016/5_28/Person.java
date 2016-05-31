class Person{
  private String name;
  private int age;
  public Person(String name,int age){
    this.setName(name);
    this.setAge(age);
    System.out.println("一个新的Person 对象产生");

  }
  public void tell(){
    System.out.println("姓名："+getName() + ",年龄"+getAge());
  }


  public String getName(){
    return name;
  }

  public void setName(String n){
    name = n;
  }

  public int getAge(){

      return age;

  }

  public void setAge(int a){
        if(a >= 0 && a < 150){
    age = a;
  }
  }
}
