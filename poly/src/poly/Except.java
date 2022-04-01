package poly;

public class Except {
	public static void main(String args[]) {
		try {
			int data=13;
			int c[]={ 1 };
			c[42]=99;
			
		}catch (ArithmeticException e) {
			System.out.println(""+e);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(""+e);
		}finally {
			System.out.println("dont wory");
		}
		
			
		
		
	}

}
