package day6;

public class SingleDimensionalArrayDemo {

	public static void main(String[] args) {
		int a[] = {100,200,300,400};
		for (int i=0; i<a.length; i++)
		{
			System.out.println(a[i]);
		}
		// print lenght of the array
		System.out.println("Length of the array: "+ a.length);
		//print specific location of the array
		System.out.println("Specific Location: "+a[3]);
		System.out.println("Specific Location: "+a[0]);
	}

}
