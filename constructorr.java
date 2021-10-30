class car
{
   car()
{
System.out.println("how r u");
}
   car(int a,int b)
   { 
    System.out.println(a*b);
   }
}
class truck
{
   truck(int a, int b)
{
System.out.println(a+b);
}
   truck()
   {
    System.out.println("tata truck");
   }
}
class constructorr
{
public static void main(String args[])
{
 car k = new car();
 car k1 = new car(4,5);
 truck s = new truck(4,5);
 truck s1 = new truck();
 
}
}