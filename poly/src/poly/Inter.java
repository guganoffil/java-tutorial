package poly;

interface Inter {
	void print() ;
	
	void display() ;
	

}
class face implements Inter {
	public void print(){
	System.out.println("Hai gugan");
	}
	public void display() {
		System.out.println("Hai programmer");
	}
	
	public static void main(String args[]) {
		face f= new face();
		f.print();
		f.display();
	}
}