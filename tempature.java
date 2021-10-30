import java.util.Scanner;
class tempature
{
public static void main(String arg[])
{
Scanner ob=new Scanner(System.in);
Double f, c;
System.out.println("enter the value of f");
f=ob.nextDouble();
c=(f-32*5)/100;
System.out.println(c);
}
}

