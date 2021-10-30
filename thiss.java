class a
{
   int i,j,k;
    void burger(int i,int j,int k)
       {
          this.i = i;this.j = j;this.k = k;
         System.out.println(i+ " " +j+ " "+k);
        }

    void display()
    {
    System.out.println(i+ " " +j+ " "+k);
    }
 
}

class thiss
{
public static void main(String args[])
{
 a dk = new a();
 dk.burger(4,5,6);
 dk.display();
}
}