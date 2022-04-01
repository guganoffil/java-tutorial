package poly;

public class Manip {
	public static void main(String args[])
	{
		String g1 = new String("gugan");
		String g2 = new String("virat");
		String g3 = new String("Msd");
		System.out.println(""+g1.toUpperCase());
		System.out.println(""+g3.toLowerCase());
		System.out.println(""+g1.replace('a', 'g'));
		System.out.println(""+g2.concat(g3));
		System.out.println(""+(g1.trim()).concat(g3));
		System.out.println(""+g1.equals(g3));
		System.out.println(""+g1.equalsIgnoreCase(g2));
		
		
		
		
	}

}
