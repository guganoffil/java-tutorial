package inheritance;

public class Superr {
	int speed=100;
}
	class spr2 extends Superr{
		int speed = 50;
		void display() {
			System.out.println(super.speed);
		}
		public static void main (String args[]) {
			spr2 s = new spr2();
			s.display();
		}
		 
	}


