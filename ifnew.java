import java.util.Scanner;
class ifnew
{
public static void main(String args[])
{
Scanner ob=new Scanner(System.in);
int x,y,z;
System.out.println("enter the value of x");
x=ob.nextInt();
System.out.println("enter the value of y");
y=ob.nextInt();
System.out.println("enter the value of z");
z=ob.nextInt();
if(x>y)
{
if(x>z)
{
System.out.println("x is greater");
}
else
{
System.out.println("z is greater");
}
}
else
{
if(y>z)
{
System.out.println("y is greater");
}
else
{
System.out.println("z is greater");
}
}
}
}
