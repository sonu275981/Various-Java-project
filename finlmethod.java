 class a
{
  final void car()
   {
    System.out.println("final");
   }
}
class b extends a
{
    void car()
  {
   System.out.println("child");
  }
}
class finlmethod
{
public static void main(String args[])
{

b gk = new b();
gk.car();
}
} 