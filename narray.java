import java.util.*;
class narray

{
public static void main(String args [])
{
Scanner ob=new Scanner(System.in);

int[] a=new int[]{2,4,9,5,};
int max=a[0],sum=0,min=a[0],secnd=a[0];
for(int i=0;i<a.length;i++)
{
if(max<a[i])
{
  max=a[i];
}
}
System.out.println("max value is "+max);
for(int i=0;i<a.length;i++)
{
if(min>a[i])
{
  min=a[i];
}
}
System.out.println("min value is "+min);
for(int i=0;i<a.length;i++)
{
sum=sum+a[i];
}
System.out.println("sum of array is "+sum);

for(int i=0;i<a.length;i++)
{
  for(int j=i+1;j<a.length;j++)
   {
    if (a[i]<a[j])
     {
     int temp = a[i];
         a[i] = a[j];
         a[j] = temp;
    }
    }
    }
     System.out.println("value of secnd largest is "+a[1]);
     
}
}
