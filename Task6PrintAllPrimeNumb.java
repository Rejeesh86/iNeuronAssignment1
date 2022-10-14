package assignment1;

public class Task6PrintAllPrimeNumb {
	
	public static void main(String[] args) 
	{
		int ct , num = 1, div;
		System.out.println("Prime Numbers between 1 and 1000 are ");
		while (num < 1000) 
		{
			div = 1;
			ct = 0;
			while (div <= num) 
			{
				if (num % div == 0)
				ct++;
				div++;
			}
			if (ct == 2) 
			{
				System.out.println( num);
				
			}
			num++;
		}
	}
	
}
