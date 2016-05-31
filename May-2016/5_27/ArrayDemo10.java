public class ArrayDemo10 {
public static void main(String[] args) {
// 定义一个三维数组,使用静态初始化的方式
int score[][][] = { { { 5, 1 }, { 6, 7 } }, { { 9, 4 }, { 8, 3 } } };
for (int i = 0; i < score.length; i++) {
// 第一层循环
for (int j = 0; j < score[i].length; j++) {
// 第二层循环
for (int k = 0; k < score[i][j].length; k++) {// 第三层循环
System.out.println("score[" + i + "][" + j +"][" + k +"] = "+ score[i][j][k]);
// 输出每一个元素
}
}
}
}
}
