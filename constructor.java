 class test
{
	test()
	{
			System.out.println("this program is constructor");
	}
	test(int a,int b)
	{
		int c=a+b;
		System.out.println(c);
	}
}
class constructor
{
	public static void main(String args[])
	{
		new  test();
		new test(65,98);
                
	}
}