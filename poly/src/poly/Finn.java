package poly;

import java.io.FileInputStream;

public class Finn {
	public static void main(String args[]) {
	try {
		FileInputStream F = new FileInputStream("D:filein.text");
		int i;
		while((i=F.read()) != -1)
			System.out.println((char)i);
		F.close();
		
		
	} catch (Exception e){
		System.out.println(e);
		
	}
	}
}


