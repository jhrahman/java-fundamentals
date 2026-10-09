package day7;

import java.util.Arrays;

public class ArraySorting {

	public static void main(String[] args) {
		int a[] = {100, 500, 700, 500, 400, 1000, 900};
		
		System.out.println("Before sorting: ");
		System.out.println(Arrays.toString(a));
		
		Arrays.sort(a);
		
		System.out.println("After Sorting: ");
		System.out.println(Arrays.toString(a));

	}

}
