package poly;

abstract class Abstr {
	
abstract void run();
void walk() {
	System.out.println("walk runes");
}
}
class act extends Abstr{
	void run() {
		System.out.println("abstract works");
	}
	
	public static void main(String args[])
	{
		act A = new act();
		A.run();
		A.walk();
	}
}

