import java.util.*;
class swap
{
public static void main(String args[])
{
Scanner ob=new Scanner(System.in);
int a,b;
System.out.println("enter two no.to swap");
a=ob.nextInt();
b=ob.nextInt();
a=a+b;
b=a-b;
a=a-b;
System.out.println("value of a "+a);
System.out.println("value of b "+b);
}
}