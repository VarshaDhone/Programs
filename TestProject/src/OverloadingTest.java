class Overloading {

	public void sum(int a,int b) {
		System.out.println("In int args");
	}
	public void sum(int a,int b, int c) {
		System.out.println("In int args");
	}
	public void sum(float a,float b) {
		System.out.println("In float args");
	}
	public void sum(double a,double b) {
		System.out.println("In double args");
	}
}


public class OverloadingTest{
	public static void main(String args[])
	{
		Overloading o = new Overloading();
		o.sum(1, 2);
		o.sum(1.8f, 2.9f);
		o.sum(1.8, 2.9);
	}
}