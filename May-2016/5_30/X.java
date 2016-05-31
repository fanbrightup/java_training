interface A{
  public String AUTHOR = "范";
  public void print();
  public String getInfo();
}
interface B{
  public void say();
}
interface C extends A,B{
  public void printC();
}
class X implements A,B{
  public void say(){
    System.out.println("Hello world!");
  }
  public String getInfo(){
    return "HELLO";
  }
  public void print(){
    System.out.println("作者："+AUTHOR);
  }

}
