package day7;

import java.util.Arrays;

public class SortingString {

	public static void main(String[] args) {
		String s[] = {"D", "C", "E", "F", "A"};
		
		System.out.println("Before Sorting: "+ Arrays.toString(s));
		
		Arrays.sort(s);
		
		System.out.println("After Sorting: "+ Arrays.toString(s));
		

	}

}
