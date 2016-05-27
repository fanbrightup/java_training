//定义两个额外的变量，不去改变原数组的内容，一次比较得出最大和最小
public class ArrayDemo{
  public static void main(String[] args) {
    int score[] = {1,2,3,4,5};
    int max = 0,min = 0;
    max = min = score[0];
    for(int x = 0;x < score.length;x++){ //循环求出最大最小
      if(score[x]>max){   //如果大，则修改max内容
        max = score[x];
      }
      if(score[x]<min){

        min = score[x];  //如果小，则修改min内容
      }
    }
    System.out.println("最高成绩："+max);
    System.out.println("最低成绩："+min);

  }
}

