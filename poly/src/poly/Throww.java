package poly;

public class Throww {
	static void demo() {
		try { 
			throw new NullPointerException("hai");
			
		}catch (NullPointerException e) {
			System.out.println("caught by demo");
			
		}
	}
	public static void main(String args[]) {
			try{
				demo();
		
			}catch(NullPointerException e) {
				System.out.println("Recaught"+e);
			}

}
}
