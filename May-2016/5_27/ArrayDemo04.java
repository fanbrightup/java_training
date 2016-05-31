public class ArrayDemo04{
  public static void main(String[] args) {
    int score[] = {1,2,3,4,5};
    int max = 0,min = 0;
    max = min = score[0];
    for(int x = 0;x < score.length;x++){
      if(score[x]>max){
        max = score[x];
      }
      if(score[x]<min){

        min = score[x];
      }
    }
    System.out.println("最高成绩："+max);
    System.out.println("最低成绩："+min);

  }
}
