class india
{
  void state()
   {
     System.out.println("how r u");
   }
}
class us extends india
{
      void state()
   {
     super.state();
     System.out.println("hey hey hey");
   }
}

class polyoveride
{
   public static void main(String args[])
   {
   us k = new us();
  
   k.state();
  
   }
} 