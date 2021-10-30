import java.util.*;
class selling
{
public static void main(String args[])
{
Scanner ob = new Scanner(System.in);
System.out.println("enter selling price");
int[] a=new int[7];
int sum = 0;
int pro = 0;
int mone;
for(int i = 1;i<=6;i++)
{
 a[i] = ob.nextInt();
   sum = sum+a[i];
}
 
   System.out.println("enter the profit earned");

int[] b =new int[7];
for(int i = 1;i<=6;i++)
{
 b[i] = ob.nextInt();
 pro = pro+b[i];
}
System.out.println("total profit is");
mone = sum-pro;
System.out.println(mone);
}
}
