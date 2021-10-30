import java.util.Scanner;
class whileagain
{
public static void main(String args[])
{
Scanner ob=new Scanner(System.in);
int i=0,sum=0,n;
System.out.println("inter the value of");
n=ob.nextInt();
while(i<=n)
{
   sum=sum+i;
i++;
System.out.println(i+sum);
}
}
}