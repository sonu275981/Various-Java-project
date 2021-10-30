class test
{
	int a=10;
	public void k()
	{
		a=2;
		System.out.println("hello"+a);
	}
}
class k1 extends test
{
	public void k()
	{
		super.k();
		System.out.println("hii"+super.a);
	}
}
class mainsuper
{
	public static void main(String arg[])
	{
		k1 ob=new k1();
		ob.k();
		
	}
	
}