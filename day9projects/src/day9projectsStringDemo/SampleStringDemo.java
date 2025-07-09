package day9projectsStringDemo;

public class SampleStringDemo {
	
	public static void main(String[] args) {
		
		//initialize string
		
		char c[]= {'I','n','d','i','a'};
		
		String s1=new String(c);
		System.out.println(s1);
		
		String s2=new String(c);
		System.out.println(s2);
		
		//t
		//concatention to prevent long lines
		String longstr="this is to show"+"how long sentence" +"\t"+"can be printed";
		System.out.println(longstr);
		
	}	

}
