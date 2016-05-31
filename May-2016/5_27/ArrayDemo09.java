public class ArrayDemo09{
  public static void main(String[] args) {
    int score[][] = {{67,61},{78,89,83},{99,100,98,66}};
    for(int i = 0;i< score.length;i++){ //外层循环输出行
      for(int j = 0;j<score[i].length;j++){//内存循环输出列
        System.out.print(score[i][j] + "\t");//输出每一行
      }
      System.out.println();  //换行
    }
  }
}
