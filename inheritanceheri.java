class test
{
	public void r()
	{
		System.out.println("base");
	}
}
class k extends test
{
	public void j()
	{
		System.out.println("derive");
	}
}
class t extends test
{
	public void t1()
	{
		System.out.println("derive 2");
	}
}
class jk extends test
{
		public void t2()
		{
		System.out.println("derive 3");
		}
}
class inheritanceheri
{
	public static void main(String arg1[])
	{
	jk ob=new jk();
	 ob.t2();
	 ob.r();
	t ob1=new t();
	ob1.t1();
	ob1.r();
	k ob2=new k();
	ob2.j();
	ob2.r();
}
}