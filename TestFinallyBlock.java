class TestFinallyBlock{  
  public static void main(String args[]){  
  try{  
   int data=25/0;  
   System.out.println(data);  
  }  
    
  finally{
	int a,b,c;
		a=10;
		b=10;
		c=a+b;
		
System.out.println("finally block is always executed"+c);}  
  System.out.println("rest of the code...");  
  }  
} 