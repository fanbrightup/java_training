//索引越界异常IndexOutOfBoundsException
public class Demo39 {
	public static void main(String []  args){
		int [] a = new int[5];
		for(int i = 0;i<a.length;i++){
			a[i] = i;
		}
		for(int i = 0;i<=a.length;i++){
			System.out.println(a[i-1]+"  "+a[i]);//当i=length是就会发生索引越界异常
		}
	}
}
