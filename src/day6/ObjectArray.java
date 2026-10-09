package day6;

public class ObjectArray {

	public static void main(String[] args) {
		Object a[]= {100, 10.2, "Jahid", false};
		
		for (int i=0; i<a.length; i++)
		{
			System.out.println("Enhanced loop:" + a[i]);
		}
		
		for(Object x:a)
		{
			System.out.println(x);
		}

	}

}
