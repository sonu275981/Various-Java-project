abstract class k1
{
	abstract void k();
	
	
}
class j extends k1
{
	void k()
	{
		System.out.println("Abstract class");
	}
	public void r()
	{
		System.out.println("derive class");
	}
}
class Mainabstract
{
	public static void main(String args[])
	{
		
		j ob =new j();
		ob.r();
		ob.k();
	}
}