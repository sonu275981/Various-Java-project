
class test
{
	public void k()
	{
		System.out.println("hello");
	}
}
class hello
{
	public void j(int a,int b)
	{
	int c;
		c=a+b;
		System.out.println("hello"+"\t"+c);
	}
}
class Mainarray
{
	public static void main(String args[])
	{
		test ob=new test();
		ob.k();
		hello ob1=new hello();
		ob1.j(60,40);
	}
}