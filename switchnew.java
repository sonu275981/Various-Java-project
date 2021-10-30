import java.util.Scanner;
class switchnew
{
public static void main(String args[])
{
Scanner ob=new Scanner(System.in);
int mark;
System.out.println("enter the value");
mark=ob.nextInt();
switch(mark)
{
case 1:
System.out.println("A grade");
break;
case 2:
System.out.println("B grade");
break;
case 3:
System.out.println("c grade");
break;
default:
System.out.println("fail");
break;
}
}
}