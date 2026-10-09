package day7;

import java.util.Scanner;

public class TakingNumberInput {

	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		System.out.println("The number is: "+num);
		
		System.out.println("Enter the City: ");
		String City = sc.next();
		System.out.println("The city is: "+City);
		
	}

}
