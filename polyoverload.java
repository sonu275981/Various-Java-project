class india
{
  void state()
  {
   System.out.println("part of india");
  }
 void state(int k, int g)
  {
   System.out.println("how r u");
  }
}
class polyoverload
{
 public static void main(String args[])
 {
  india k = new india();
  k.state(4,6);
  k.state();
 }
}
