class test
{
	public void sum()
	{
		
		System.out.println("polymorfisam");
	}
	public void sum(int a,int b)
	{
		int c=a+b;
		System.out.println(c);
	}
}
class Mainpoly
{
	public static void main(String args[])
	{
		test ob=new test();
		ob.sum();
		ob.sum(65,63);
	}
}