class Emp{
	private int empid;
	public void setEmpid(int eid)
	{
		empid=eid;
	}
	public int getEmpid()
	{
		return empid;
	}
}
class Company
{
	public static void main(String args[])
	{
		Emp e=new Emp();
		e.setEmpid(101);
		System.out.println(e.getEmpid());
	}
}