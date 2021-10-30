import java.util.*;  
class TestJavaCollection1{  
public static void main(String args[]){  
ArrayList list=new ArrayList();//Creating arraylist  
list.add("Ravi");//Adding object in arraylist  
list.add("Vijay");  
list.add("Ravi");  
list.add("Ajay");  
list.add(56.65);  
list.add(65);
    //Traversing list through Iterator  
Iterator itr=list.iterator();  
while(itr.hasNext()){  
    System.out.println(itr.next());  
    }  
    }  
    }  