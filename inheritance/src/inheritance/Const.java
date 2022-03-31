package inheritance;

public class Const {
	int id;
	String name;
	
	Const(int i,String n) {
	id=i;
	name=n;
	}
	void display() {
		System.out.println(id+""+name);
	}
	public static void main(String[]args)
	{
	Const c1= new Const(1,"gug");
	Const c2= new Const(2,"gug");
	c1.display();
	c2.display();
	
	
	}
}
