import java.util.Scanner;
class reverse
{
public static void main(String arg[])
{
Scanner ob=new Scanner(System.in);
int a,b=0,r;
System.out.println("enter the three no.");
a=ob.nextInt();
r=a%10;
b=b*10+r;
a=a/10;
r=a%10;
b=b*10+r;
a=a/10;
r=a%10;
b=b*10+r;
a=a/10;
System.out.println(b);
}
}
