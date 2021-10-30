import java.util.Scanner;
class labour
{
public static void main(String args[])
{
Scanner ob=new Scanner(System.in);

int e,pay,h;
for(int i=1;i<=10;i++){
System.out.println("enter the number of hours for"+i+"employee");
h=ob.nextInt();
if(h<=40)
{pay=h*10;
System.out.println(pay);
}
else{
e=h-40;
pay=e*12+400;
System.out.println(pay);




}
}
}
}