package hello;



public class fin {
	int rno;
	String name;
    final String college = "ucev";

fin(int r,String n){
	rno = r;
	name = n;
}
void display() {
	System.out.println(rno+""+name+""+college);
}
public static void main (String args[]) {
	
	fin s1=new fin(1,"gug");
 fin s2=new fin(2,"sub");
	s1.display();
	s2.display();
	
}


}
