package day1projects;

import java.util.Scanner;

public class Project6 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
				
		switch(n) {
		

		case 1 : System.out.println("Monday");
		break;
		
		case 2 : System.out.println("Tusday");
		break;
		
		case 3 : System.out.println("wednesday");
		break;
		
		case 4 : System.out.println("Thursday");
		break;
		
		case 5 : System.out.println("Friday");
		break;
		
		case 6 : System.out.println("Saturday");
		break;
		
		default : System.out.println("Sunday");
		break;
		
		}

	}

}
