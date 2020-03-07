class Object2{
	String str =" this is newinstance method of class";
	public static void main(String args[]) throws InstantiationException, IllegalAccessException
	{
		
			
			Object2 obj= Object2.class.newInstance();
			System.out.println(obj.str);
		}
		
	}
