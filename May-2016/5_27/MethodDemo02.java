public class MethodDemo02{
  public static void main(String[] args) {
    int one = addOne(10,20);
    float two = addTwo(10.3f,13.3f);
    System.out.println("addOne:   "+one);
    System.out.println("addTwo:   "+two);
  }

  public static int addOne(int x,int y){
    int temp = 0;
    temp = x + y;
    return temp;
  }

  public static float addTwo(float x, float y) {
    float temp = 0;
    // temp为局部变量,只在此方法中有效
    temp = x + y;
    // 执行加法计算
    return temp;
    // 返回计算结果
    }
}
