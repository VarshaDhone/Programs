import java.util.ArrayList;
import java.util.Iterator;
class TestJavaCollection1{  
public static void main(String args[]){  
ArrayList<String> list=new ArrayList<String>();
list.add("Ravi");
list.add("Vijay");  
list.add("Ajay");  

Iterator <String> itr= list.iterator();
while(itr.hasNext()) {
	System.out.println(itr.next());  
}

}  

}  
