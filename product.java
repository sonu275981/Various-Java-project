import java.util.*;
class product
{
public static void main(String args[])
{
Scanner ob=new Scanner(System.in);
int[][] a = new int [2][2];
int[][] b = new int [2][2];
int[][] c = new int [2][2];

System.out.println("enter the value of array a");
for(int i=0;i<a.length;i++)
 {
  for(int j=0;j<a.length;j++)
   {
    a[i][j]=ob.nextInt();
   }
  }

 System.out.println("enter the value of array b");
 for(int i=0;i<b.length;i++)
  {
   for(int j=0;j<b.length;j++)
    {
     b[i][j]=ob.nextInt();
    }
   }
 
   System.out.println("product of matric");
for(int i=0;i<c.length;i++)
{
 for(int k=0;k<c.length;k++)
  {
   for(int j=0;j<c.length;j++)
    {
     c[i][j]=c[i][j]+a[i][k]*b[k][j];
    }
   }
   }
 for(int i=0;i<2;i++)
  {
   System.out.println();
   for(int j=0;j<2;j++)
    {
     System.out.print(c[i][j]+ "\t"); 
   }
   }
}
}



