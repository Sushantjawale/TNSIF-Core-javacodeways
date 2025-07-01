package day1projects;

import java.util.Scanner;

public class Project4 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		if(n % 2 == 0) {
			System.out.println("number is Even");
		}else {
			System.out.println("Number is odd");
		}
	}

}
