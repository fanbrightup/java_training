//ArrayStoreException
public class Demo37 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object obj[] = new String[5];
		for(int i = 0;i < obj.length;i++){
			obj[i] = new Integer[i];
			
			System.out.println(" "+ obj[i]);
		}
	}

}
