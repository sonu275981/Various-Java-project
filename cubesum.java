import java.util.Scanner;
class cubesum
{
public static void main(String arg[])
{
Scanner ob=new Scanner(System.in);
int sum=0,a,num;
System.out.println("enter the no.");
num=ob.nextInt();
a=num%10;
sum=sum+a;
num=num/10;
a=num%10;
sum=sum+a;
num=num/10;
a=num%10;
sum=sum+a;
num=num/10;
System.out.println(sum);
}
}


