abstract class A
{
	abstract void car();
}
class B extends A
{
	void car()
	{
		System.out.println("how how r r u u ");
		
	}
}
class C extends B
{
	void car()
	{
		super.car();
		System.out.println("tom tom tom ");
	}
}
class abstractt
{
	public static void main(String args[])
	{
		C k = new C();
		k.car();
	}
}