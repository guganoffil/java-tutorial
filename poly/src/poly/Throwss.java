package poly;

public class Throwss {
	static void demo()
	throws NullPointerException{
	
		
		throw new NullPointerException("hello");
	}
	public static void main(String args[]) {
		try{
			demo();
	
		}catch(NullPointerException e) {
			System.out.println("Recaught"+e);
		}

}

}
