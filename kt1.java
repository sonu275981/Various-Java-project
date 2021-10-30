import java.util.*;
class kt1
{
	public static void main(String args[])
	{
		int ch;
		Scanner ob=new Scanner(System.in);
		ch=ob.nextInt();
		switch(ch)
		{
			case 1:
				System.out.println("you are in case 1");
			break;
			case 2:
				System.out.println("you are in case 2");
			break;
			case 3:
				System.out.println("you are in case 3");
			break;
			case 4:
				System.out.println("you are in case 4");
			break;
			default :
				System.out.println("you enter wrong choice ");
			break;
		}
	}
}