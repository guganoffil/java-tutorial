package inheritance;


public class inhe {
	int salary=15000;
	

}
class bonu extends inhe
{
	int bonus=3000;
	public static void main(String args[])
	{
		bonu bon= new bonu();
		System.out.println("salary is"+bon.salary);
	    System.out.println("bonus is"+bon.bonus);
	}
}


