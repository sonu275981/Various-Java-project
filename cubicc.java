import java.util.Scanner;
class cubicc
{
public static void main(String args[])
{
Scanner ob=new Scanner(System.in);
int sum=0,a,num;
System.out.println("enter the no.");
num=ob.nextInt();
a=num%10;
sum=sum+a*a*a*a;
num=num/10;
a=num%10;
sum=sum+a*a*a*a;
num=num/10;
a=num%10;
sum=sum+a*a*a*a;
num=num/10;
System.out.println(sum);
}
}