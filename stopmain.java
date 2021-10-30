class stopk1 extends Thread  
{
  public void run()
  {
   for(int x=1;x<=5;x++)
    {
    System.out.println("sonu is brave");
    }
  }
}
class stopk2 extends Thread  
{
  public void run()
  {
   for(int x=1;x<=5;x++)
    {
    System.out.println("sonu is good");
    }
  }
}
class stopmain
{
  public static void main(String args[])
  {
   stopk1 k1 = new stopk1();
   stopk2 k2 = new stopk2();
    k1.start();
    k2.start();
  }
}