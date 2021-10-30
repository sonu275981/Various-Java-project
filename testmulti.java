import java.util.*;
class testmulti
{
	public void k()
	{
		Scanner ob=new Scanner(System.in);
		int[][] a=new int[10][10];
		int[][] b=new int[10][10];
		int[][] c=new int[10][10];
		int i,j,k;
		for(i=0;i<2;i++)
		{
			for(j=0;j<2;j++)
			{
				a[i][j]=ob.nextInt();
			}
		}
		System.out.println("second array element");
		for(i=0;i<2;i++)
		{
			for(j=0;j<2;j++)
			{
				b[i][j]=ob.nextInt();
			}
		}
		
		for(i=0;i<2;i++)
		{
			for(k=0;k<2;k++)
			{
			for(j=0;j<2;j++)
			{
				c[i][j]=c[i][j]+a[i][k]*b[k][j];
			}
		}
		}
		System.out.println("Multiplication of array are");
		for(i=0;i<2;i++)
		{
			System.out.println();
			for(j=0;j<2;j++)
			{
				System.out.print("\t"+c[i][j]);
			}
		}
		
				
	}
	public static void main(String args[])
	{
	
		testmulti ob=new testmulti();
			ob.k();	
	}
}