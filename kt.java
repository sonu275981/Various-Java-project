import java.util.*;
class kt
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
		else if(score>80 && score<90)
		{
			System.out.println("B Grade");
		}
		else if(score>70 && score <80)
		{
			System.out.println("C Grade");
		}
		else
		{
			System.out.println("D Grade");
		}
	}
}