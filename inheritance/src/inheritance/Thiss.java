package inheritance;

public class Thiss {
	int id;
	String name;


Thiss(int id,String name)
{
	this.id = id;
	this.name = name;
}
void display()
{
	System.out.println(id+""+name);
}
public static void main(String []args)
{
	Thiss tk1 = new Thiss(14,"gugans");
Thiss tk2 = new Thiss(13,"gugan");
tk1.display();
tk2.display();

}
}