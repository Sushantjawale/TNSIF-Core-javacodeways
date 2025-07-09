package day9projectsStringDemo;

public class StringComparison {

	public static void main(String[] args) {
		
		//creating string using literals // pool memory
		
		String s1 = "tnsif";
		String s2 = "TNSIF";
		
		//creating new String operator // heap memory
		
		String s3=new String ("TNSIF");
		String s4=new String ("TNSIF");
		
		//equals
		
		System.out.println("Case 1:"+ (s1==s2));
		System.out.println("Case 2:"+ (s1==s3));
		System.out.println("Case 2:"+ (s1.equals(s1)));
		System.out.println("Case 2:"+ (s1.equals(s4)));
		System.out.println("Case 2:"+ (s1==s4));
		System.out.println("Case 2:"+ (s1.equals(4)));
		
		//compare by using compareTo
		
		System.out.println(s1.compareTo(s4));
		
		System.out.println(s1.compareToIgnoreCase(s4));

	} 
}
