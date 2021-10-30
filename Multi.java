class Multi extends Thread{  
public void run(){  
for(int i=0;i<5;i++)
{
 try{Thread.sleep(500);
System.out.println(i);
}catch(InterruptedException e){System.out.println(e);} 
}
}  
public static void main(String args[]){  
Multi t1=new Multi();  
t1.start();  
Multi t2=new Multi();  
t2.start(); 
 }  
}  