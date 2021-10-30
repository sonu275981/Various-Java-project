class j
{
	j()
	{
		System.out.println("level 0");
	}
}
class jk extends j
{
	jk()
	{
		System.out.println("level 1");
	}
}
class r extends jk
{
	r()
	{
		System.out.println("level 2");	
	}
}
class inheritancemulti
{
	public static void main(String args[])
	{
		new r();
	}
}
