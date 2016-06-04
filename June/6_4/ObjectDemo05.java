public class ObjectDemo05{
  public static void main(String[] args) {
    int[] temp = {1,3,5,7,9};  // 定义数组
    Object obj = temp;//  使用Object接收数组
    print(obj); //  传递数组引用
  }
  public static void print(Object o){// 接收一个对象
    if(o instanceof int[]){// 判断对象的类型，判断其是否为整型数组
      int x[] = (int[]) o;//  向下转型
      for(int i = 0;i<x.length;i++){//  循环输出
        System.out.print(x[i]+"\t");
      }
    }
  }
}
