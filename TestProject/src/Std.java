public class Std
{
	int id;
	String name;
	Std(int i , String n)
	{
		id=i;
		name=n;
	}
	void display()
	{
		System.out.println(id+" "+name);
	}
		
		public static void main(String args[])
		{
			Std s1= new Std(11 , "kiran");
			Std s2= new Std(22 , "Amol");
			
			s1.display();
			s2.display();
		}
	}

