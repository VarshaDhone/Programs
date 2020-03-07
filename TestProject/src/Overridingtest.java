class Test{
	void run() {
		System.out.println(" trying Method Overriding");
	}
}

class Overridingtest extends Test{
	void run() {
		System.out.println("Method Overridden done");
	}
	public static void main(String args []) {
		Test ot = new Overridingtest();
		ot.run();
	}
}
