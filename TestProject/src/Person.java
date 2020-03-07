abstract class People
{
	abstract void msg();
}
class student extends People
{
	void msg()
	{
		System.out.println("My name is Adil");
	}
}
	
	class Person
	{
	public static void main(String args[]) 
	{
		student std= new student();
		std.msg();
		
	}
	}
