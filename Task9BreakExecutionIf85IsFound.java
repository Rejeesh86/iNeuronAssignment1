package assignment1;

import java.util.Scanner;

public class Task9BreakExecutionIf85IsFound 
{

	public static void main(String[] args)
	{	
		
		Scanner sc = new Scanner(System.in);
		int input;
		System.out.println("Program will break the current execution untill user input 85");
		do
		{
			System.out.println("Enter your input");
			input = sc.nextInt();
			
		}while (input!=85);
			
		System.out.println("85 entered by user85. Execution breaking");			
	}
}