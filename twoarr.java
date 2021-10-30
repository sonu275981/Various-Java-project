import java.util.*;
class twoarr
{
    public static void main(String args[])
    {
    Scanner ob=new Scanner(System.in);

        int[][] a= new int [2][2];
        int[][] b= new int [2][2];
        int[][] c= new int [2][2];

        System.out.println("inter the value of a");

        for(int i=0;i<2;i++)
        { 

          for(int j=0;j<2;j++)
          {
            a[i][j]=ob.nextInt();
          } 
          }
            System.out.println("inter the value of b");

              for(int i=0;i<2;i++)
               { 

               for(int j=0;j<2;j++)
                {
                 b[i][j]=ob.nextInt();
                } 
                }
               
                 System.out.println("sum of array a and b is equal to c");

                   for(int i=0;i<2;i++)
                    { 

                     for(int j=0;j<2;j++)
                      {
                      c[i][j]=a[i][j]+b[i][j];
                       } 
                        }

                           System.out.println("output");

                            for(int i=0;i<2;i++)
                              { 
                                 System.out.println();
                                for(int j=0;j<2;j++)
                               {
                                   System.out.print("\t" +c[i][j]);

                                }
                                }
                                }
                                }









                         