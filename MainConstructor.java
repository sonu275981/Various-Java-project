class test
{
	test()
	{
		System.out.println("hello");
	}
	test(int a,int b)
	{
		int c=a+b;
		System.out.println(c);
	}
	
}
class MainConstructor
{
	public static void main(String args[])
	{
		test ob=new test();
		new test(65,96);
	}
}