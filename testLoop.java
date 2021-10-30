import java.util.*;
class testLoop
{
		public static void main(String args[])
		{
			Scanner ob=new Scanner(System.in);
			int i,j,n,sum;
			System.out.println("Enter the value of n");
			n=ob.nextInt();
			sum=0;
			for(i=0;i<=n;i++)
			{
				sum=sum+i;
				System.out.println(sum);
			}
			
		}
}