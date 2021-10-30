import java.util.*;
class transpose
{
public static void main(String args [])
{
 Scanner ob=new Scanner(System.in);
int [][] a = new int [2][2];
int [][] b = new int [2][2];

System.out.println("enter value of a array");
for(int i=0;i<a.length;i++)
 {
  for(int j=0;j<a.length;j++)
    {
     a[i][j] = ob.nextInt();
     
    }
    }

   System.out.println("enter value of b array"); 
   
   for(int i=0;i<a.length;i++)
    {
     System.out.println();
     for(int j=0;j<a.length;j++)
      {
     System.out.print(a[i][j]+ "\t");   
     
    }
    }
        for(int i=0;i<a.length;i++)
    {
     System.out.println();
     for(int j=0;j<a.length;j++)
      {
     System.out.print("  ");   
     
    }
    } 
       for(int i=0;i<a.length;i++)
    {
     System.out.println();
     for(int j=0;j<a.length;j++)
      {
     System.out.print(a[j][i]+ "\t");   
     
    }
    }

 
}
}