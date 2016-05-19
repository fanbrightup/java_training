//ArrayIndexOutOfBoundsException
public class Demo36 {

	public static void main(String[] args) {
		int [] a = new int[5];
		try{
		for(int i = 0;i<10;i++){
			a[i] = i+20;
		}
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("数组越界");
		}
		System.out.println(a);
	}

}
