interface Printable
{
	void print();
}
interface Showable{
	void show();
}
class Multiple implements Printable , Showable
{
	public void print()
	{
		System.out.println("hello");
	}
	public void show()
	{
		System.out.println("Welcome");
	}
	public static void main (String args[])
	{
	Multiple mul = new Multiple();
	
	mul.print();
	mul.show();
}
}