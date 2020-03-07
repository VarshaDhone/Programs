class Employee{
	int salary= 40000;
}
class Programmer extends Employee{
	int bonus= 10000;
	public static void main(String args[])
	{
		Programmer pm = new Programmer();
		System.out.println("Prograamer salary is:" +pm.salary);
		System.out.println("Prograamer bonus is:" +pm.bonus);
	}
}