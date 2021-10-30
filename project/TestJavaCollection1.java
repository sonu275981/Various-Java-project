import java.util.*;  
class TestJavaCollection1{  
public static void main(String args[]){  
ArrayList<String> list=new ArrayList<String>();//Creating arraylist  
list.add("Ravi");//Adding object in arraylist  
list.add("Vijay");  
list.add("Ravi");  
list.add("Ajay");
System.out.println(list);
//Traversing list through Iterator  
 for(String str:list)
{
System.out.println(str);  
 } 
}  
}  