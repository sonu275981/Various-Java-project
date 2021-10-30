class ram
{
  ram()
  {
    System.out.println("sonuuuu");
  }
   
    ram(int a,int b)
    {
     System.out.println(a+b);
     }
 } 
   class parul extends ram
   {
     parul()
     {
       System.out.println("sita");
     }
   }
class kans
{   
public static void main (String args[])
{
  ram k1 = new ram();
  ram k2 = new ram(6, 8);
  parul anu = new parul();
  anu.ram(10, 25);
}
}
  