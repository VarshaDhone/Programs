 public class StringMethods {
        
  public static void main(String[] args) {
                   int i=5;
                   String str="software";
                   String str1="tester";
                   str.concat("engineering");

System.out.println("str.length()=="+str.length());
System.out.println("str.substring=="+str.substring(2, 4));
System.out.println("String.valueOf(i)=="+String.valueOf(i));
String sf=String.valueOf(1.1);
System.out.println("sf=="+sf);
System.out.println("str.equals(str1)=="+str.equals(str1));
System.out.println(str.toUpperCase());
System.out.println("str.contains=="+str.contains("of"));
          }
} 