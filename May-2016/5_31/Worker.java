class Worker extends Person {
// 定义Worker类继承Person类
private float salary;
public Worker(String name, int age, float salary) {
super(name, age);
// 调用父类的构造方法
this.salary = salary;
}
public String getContent() {
// 覆写父类中的抽象方法
return  "工人信息 --> 姓名:" + super.getName() +
";年龄:" + super.getAge()
+ ";工资:" + this.salary;
}
}
