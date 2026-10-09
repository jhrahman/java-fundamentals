package day7;

public class LenarSearch {

	public static void main(String[] args) {
		int a[] = {10, 20, 30, 40, 50, 700};
		int search_element = 300;
		
		boolean status = false;
		
		for (int i=0; i<a.length; i++)
		{
			if(a[i]==search_element)
			{
				System.out.println("Element Found");
				status = true;
				break;
			
			}
		}
		if (status ==false)
		{
			System.out.println("Element not Found");
		}

	}

}
