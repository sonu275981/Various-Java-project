import java.util.*;
class testdowhile
{
	public static void main(String args[])
	{
		Scanner ob=new Scanner(System.in);
		int n=ob.nextInt();
		int i=0,sum=0;
		do
		{
			sum=sum+i;
			i++;
			System.out.println(i+"value of sum="+sum);
		}	
		while(i>=n);
	}
}