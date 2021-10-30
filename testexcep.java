import java.util.*;
class testexcep
{
	public static void main(String args[])
	{
		try
		{
		int a,b,c;
		Scanner ob=new Scanner(System.in);
		System.out.println("ENTER THE VALUE OF A");
		a=ob.nextInt();
		System.out.println("ENTER THE VALUE OF B");
		b=ob.nextInt();
		c=a/b;
		System.out.println(c);
		}
		catch(Exception e)
		{
			System.out.println("Wrong number"+e);
		}
	}
}