package day6;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		int a[][] = { 	{ 100, 200 }, 
						{ 300, 400 }, 
						{ 500, 600 } };

		System.out.println(a[2][1]);
		System.out.println("Number of rows: "+a.length);
		
		for (int r=0; r<a.length; r++)
		{
			for(int c=0;c<a[r].length;c++)
			{
				System.out.print(a[r][c]+" ");
			}
			System.out.println();
		}

	}

}
