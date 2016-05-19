//ClassCastException
public class Demo38 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object x =new Integer(0);
		System.out.println((String)x);//Integer类型无法转成String
	}

}
