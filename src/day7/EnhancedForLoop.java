package day7;

public class EnhancedForLoop {

	public static void main(String[] args) {
		int a[] = {10,20,30,500,400};
		int search_element = 700;
		
		boolean status = false;
		
		for (int x:a)
		{
			if(search_element==x)
			{
				System.out.println("Element Found");
				status = true;
				break;
			}
		}
		if (status==false)
		{
			System.out.println("Element not found");
		}

	}

}
