package poly;



public class Polym {

		void test() {
			System.out.println("empty");
			
		}
		void test(int a) {
			System.out.println("value of a" +a);	
		}
		void test(int a,int b) {
			System.out.println("value of a and b:" +a+""+b);	

	}
	}
	class over {
		public static void main(String args[]) {
		
			Polym p = new Polym();
			p.test();
			p.test(10);
			p.test(40,60);
		}
	}

