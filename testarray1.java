import java.util.*;
class testarray1
{
	public static void main(String args[])
	{
		Scanner ob=new Scanner(System.in);
		int[] arr=new int[7];
		System.out.println("Enter the value of num");
		for(int k=0;k<6;k++)
		{
			
			arr[k]=ob.nextInt();
		}
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