import java.util.Scanner;
class condition
{
public static void main(String args[])
{
Scanner ob=new Scanner(System.in);
int a,b,c;
System.out.println("enter the value of a");
a=ob.nextInt();
System.out.println("enter the value of b");
b=ob.nextInt();
System.out.println("enter the value of c");
c=ob.nextInt();
if(a>b)
{

if(a>c)
{
System.out.println("a is greater");
}
else
{
System.out.println("c is greater");
}
}
else
{
if(b>c)
{
System.out.println("b is greater");
}
else
{
System.out.println("c is greater");
}
}

}
}

