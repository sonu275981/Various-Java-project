import java.util.*;
class dupl
{
public static void main(String args[])
{
Scanner ob=new Scanner(System.in);
int[] arr=new int[]{2,4,6,6,7,8,9};
for(int i=1;i<arr.length-1;i++)
{
for(int j=i+1;j<arr.length;j++)
{
if(arr[i]==arr[j])
{
System.out.println("the duplicate no. is "+arr[j]);
}
}
}
}
}