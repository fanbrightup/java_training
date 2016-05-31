class A {
public void fun1() {
System.out.println("A --> public void fun1(){}");
}
public void fun2() {
this.fun1();
}
};
class B extends A {
public void fun1() {
System.out.println("B --> public void
}
public void fun3() {
System.out.println("B --> public void
}
};
public class InstanceofDemo01 {
public static void main(String[] args) {
A a1 = new B();
System.out.println("A a1 = new B():"
System.out.println("A a1 = new B():"
A a2 = new A();
System.out.println("A a2 = new A():"
System.out.println("A a2 = new A():"
}}
