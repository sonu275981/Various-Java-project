import java.util.Scanner;
class school
{
public static void main(String arg[])
{
Scanner ob=new Scanner(System.in);
int p,n;
Double r,si;
System.out.println("enter the value of p");
p=ob.nextInt();
System.out.println("enter the value of n");
n=ob.nextInt();
System.out.println("enter the value of r");
r=ob.nextDouble();
si=p*n*r/100;
System.out.println(si);
}
}