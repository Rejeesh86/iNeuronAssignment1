package assignment1;

import java.util.Scanner;

public class Task10BreakExecutionIfSeleniumIsFound 
{

	public static void main(String[] args)
	{	
		
		Scanner sc = new Scanner(System.in);
		String input;
		System.out.println("Program will break the current execution untill user inputs selenium");	
		do
		{
			System.out.println("Enter your input");
			input = sc.next();
			
		}while (!input.equalsIgnoreCase("Selenium"));
			
				System.out.println("Entered input is Selenium. Execution breaking");
	}
}