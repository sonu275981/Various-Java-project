import java.util.*;
class arrayy
{
public static main(String args[])
{
Scanner ob=new Scanner(System.in);
int[] a=new int[10];
int i,sum;
for(i=0;i<=5;i++)
{
a[i]=ob.nextInt();
}
for(int k :a)
{
//a[i]=ob.nextInt();
System.out.println(k);
}
}
}