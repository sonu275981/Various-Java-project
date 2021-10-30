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
	public void jk()
	{
		System.out.println("hello");
	}
}
class k extends test
{
	k()
	{
		System.out.println("Derive class");
	}

}
class inheritancesingle
{
	public static void main(String args[])
	{
		new k();
		
	
	//	new test(65,65);
		//ob1.jk();
		
	}
}