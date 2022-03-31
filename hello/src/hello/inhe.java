package hello;

public class inhe {
	int salary=15000;
	

}
class bon extends inhe
{
	int bonus=3000;
	public static void main(String args[])
	{
		bon b= new bon();
		System.out.println("salary is"+b.salary);
	    System.out.println("bonus is"+b.bonus);
	}
}
