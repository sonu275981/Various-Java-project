class stopk1 implements Runnable  
{
  public void run()
  {
   for(int x=1;x<=5;x++)
    {
    System.out.println("sonu is brave");
    }
  }
}
class stopk2 implements Runnable  
{
  public void run()
  {
   for(int x=1;x<=5;x++)
    {
    System.out.println("sonu is good");
    }
  }
}
class stopmain2
{
  public static void main(String args[])
  {
   stopk1 k1 = new stopk1();
   stopk2 k2 = new stopk2();
    Thread t1 =new Thread(k1); 
     Thread t2 =new Thread(k2);   
    t1.start();
    t2.start();
  }
}