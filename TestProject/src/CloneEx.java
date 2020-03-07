public class CloneEx implements Cloneable   
{    
protected Object clone() throws CloneNotSupportedException   
{   
return super.clone();   
}   
String name = "Microprocessor";   
public static void main(String[] args)   
{   
CloneEx obj1 = new CloneEx();  
try  
{   
CloneEx obj2 = (CloneEx) obj1.clone();   
System.out.println(obj2.name);   
}   
catch (Exception e)   
{   
e.printStackTrace();  
}
}
}