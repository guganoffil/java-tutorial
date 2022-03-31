package hello;



public class Stat {
	int rno;
	String name;
    static  String college = "ucev";

Stat(int r,String n){
	rno = r;
	name = n;
}
void display() {
	System.out.println(rno+""+name+""+college);
}
public static void main (String args[]) {
	college="SRM";
	Stat s1=new Stat(1,"gug");
	Stat s2=new Stat(2,"sub");
	s1.display();
	s2.display();
	
}

}
