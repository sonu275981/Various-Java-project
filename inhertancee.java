class papa
{
  void eat()
  {
   System.out.println("how r u");
  }
}
class mom extends papa
{
  void house()
  {
   System.out.println("always fine i want");
  }
}
class msis extends mom
{
   void caring()
   {
    System.out.println("good future");
   }
}
class rsis extends msis
{
   void foody()
   {
    System.out.println("helpful");
   }
}
class inhertancee
{
  public static void main(String args[])
  {
     rsis k = new rsis();
     k.eat();
     k.house();
     k.caring();
     k.foody();
  }
}







