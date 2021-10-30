import java.util.*;
class testnestLoop
{
		public static void main(String args[])
		{
			Scanner ob=new Scanner(System.in);
			int i,j,n,sum,k=0;
			System.out.println("Enter the value of n");
			n=ob.nextInt();
			sum=0;
			for(i=0;i<=n;i++)
			{
				System.out.println("");
				for(j=0;j<=i;j++)
				{
					k++;
					System.out.print(k);
				}
		                                    	
			}
			
		}
}