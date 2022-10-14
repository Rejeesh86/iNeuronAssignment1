package assignment1;

public class Task4PrintAllEvenNumb {
	
	public static void main(String[] args)
	{
	
		int rem;
		System.out.println("Even numbers between 1 and 200 are below : ");
		for (int i=1;i<=200;i++)
		{
			rem=i%2;
			if (rem==0)
			{
				System.out.printf("%d ",i);
			}
		}
		
	}

		
}
