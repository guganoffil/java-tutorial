package inheritance;

public class Multilev {
	int salary=5000;

}
class pro extends Multilev{
	String name="gugan";
}
class pro1 extends pro{
	int id=001;
	
}
class pro2 extends pro1{
	String country="india";
	public static void main(String args[]) {
		pro2 p = new pro2();
		System.out.println("id is"+p.id);
		
		System.out.println("name is"+p.name);
		System.out.println("salary is"+p.salary);
		System.out.println("country is"+p.country);
		
	}
}
