package day3projects;

public class Executor {
	public static void main(String[] args) {
		
		Base b1=new Base();
		b1.methodDefault();
		b1.methodProtected();
		b1.methodPublic();
		
		b1.varDefault=1;
		b1.methodDefault();
		
		b1.varProtected=100;
		b1.methodProtected();
	}

}
