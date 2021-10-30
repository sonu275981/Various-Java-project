import java.util.*;
class score2
{
	public static void main(String args[])
	{
		int score;
		Scanner ob=new Scanner(System.in);
		score=ob.nextInt();
		if(score>=90)
{
System.out.println("A grade");
}
else if(score>=80)
{
System.out.println("B grade");
}
else if(score>=70)
{
System.out.println("c grade");
}
else
{
System.out.println("D grade");
}
}
}