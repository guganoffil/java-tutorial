package poly;
import java.io.FileOutputStream;
public class Filehand {
	public static void main(String args[]) {
	try {
		FileOutputStream F = new FileOutputStream("D:filein.text");
		String s="hai gugan";
		byte b[]=s.getBytes();
		F.write(b);
		F.close();
		System.out.println("success");
		
	} catch (Exception e){
		System.out.println(e);
		
	}
	}
}

		
		
	
	
	




