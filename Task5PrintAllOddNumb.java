package assignment1;

public class Task5PrintAllOddNumb {
	
	public static void main(String[] args) {
	
		int rem;
		int i=1;
		System.out.println("Odd numbers between 1 and 50 are below : ");
		while (i<=50)
		{
			rem=i%2;
			if (rem!=0)
			{
				System.out.println(i);
			}
			++i;
		}
		System.out.println("End");
	}

		
}
