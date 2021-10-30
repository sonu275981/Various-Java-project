class test
{
	static int a=1;
		static void k()
		{
			int a=20;
			System.out.println(a);
			a++;

		}
}
class statickey
{
	public static void main(String arg[])
	{
		test ob=new test();
		ob.k();
		test ob1=new test();
		ob1.k();
		test ob2=new test();
		ob2.k();
		
	}
}
