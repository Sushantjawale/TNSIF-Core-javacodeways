package day3projects;

public class Base {
	
	int varDefault = 10;
	public int varPublic = 20;
	protected int varProtected = 40;
	
	void methodDefault()
	{
		System.out.println("default acess base class");
		System.out.println("default varible : "+ varDefault);
	
	}
	public void methodPublic()
	{
		System.out.println("Public access base class");
		System.out.println("Public varible : "+ varPublic);
	}
	private void methodPrivate()
	{
		System.out.println("private access base class");
		System.out.println("private varible : "+ varPrivate);
	}
	
	protected void methodProtected()
	{
		System.out.println("Protected access base class");
		System.out.println("Protected varible :"+ varProtected);
	}

}
