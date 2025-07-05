package day6projectsFinalDemo;

final class FinalClass{
	
	void show() {
		System.out.println("Final class can not be inherited");
	}
}

public class FinalClassDemo {

	public static void main(String[] args) {
		
		FinalClass f=new FinalClass();
		f.show();
	}
	
}



