package day3;

public class OperatorsPractice {

	public static void main(String[] args) {
		int a = 100;
		int b =200;
		System.out.println("This is the sum:"+(a+b));
		boolean result=a>=b;
		System.out.println(a>b);	
		System.out.println(result);
		
		boolean x = true;
		boolean y = false;
		
		System.out.println("The AND Operation:"+(x&&y));
		System.out.println("The OR Operation:"+(x||y));
		
		//increment operator
		int z = 10;
		z++;
		System.out.println(z);
	}

}
