import java.lang.reflect.Constructor;

 public class Object3
{
	String str ="heloo";
	public static void main(String args[])
	{
		try
		
		{
			Constructor<Object3>constructor = Object3.class.getConstructor();
			Object3 obj  = constructor.newInstance();
			System.out.println(obj.str);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}