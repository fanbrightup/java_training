//除零异常
public class Demo35 {

	public static void main(String[] args) {
		int i = 0,j = 9,k = 0;
		try{
		k = j /i;
		}catch (ArithmeticException e){
			System.out.println("除零异常");
			e.printStackTrace();
		}
		System.out.println(k);

	}

}
