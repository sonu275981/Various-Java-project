class one
{
  public void  divi(int a,int b)
   {
    System.out.println("divison of two no. " + a/b);
   }
}
class two
{
  public void forr()
   {
  for(int i=0;i<=5;i++)
   {
     System.out.println("for loop is " + i + " " + i*2);
   }
   }
}
class three
{
 public void substr(int k,int f)
  {
    System.out.println("Substraction of two no.");
    System.out.println( k-f);
  }
}
class encapto
{
public static void main(String args[])
 {
   one ob = new one();
   ob.divi(40,20);
   two ob1 = new two();
   ob1.forr();
   three ob2 = new three();
   ob2.substr(100,50);
 }
}
      
    