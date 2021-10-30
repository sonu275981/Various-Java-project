interface A
{
	public void k1();
}
interface B 
{
	public void r()	
	{
		System.out.println("jo");
	}	
}
interface X extends B
{
	public void j();
}

class k  implements X,A
{
	public void k1()
	{
		System.out.println("HII");
	}
	public void r()
	{
		System.out.println("Welcome");
	}
	public void j()
	{
		System.out.println("hoo");
	}
}
class testinter
{
	public static void main(String args[])
	{
		k ob=new k();
		  ob.k1();
		ob.r();
		ob.j();		
	}
}
