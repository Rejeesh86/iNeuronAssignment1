package assignment1;

public class Task10BreakExecutionIfSeleniumIsFound2Updated 
{

	public static void main(String[] args)
	{	
		
		String input [] = {"Java","JavaScript","Selenium","Python","Mukesh"};
		for (int i=0; i<input.length;i++)
		{
			if(!input[i].equals("Selenium"))
			{
				System.out.println(input[i]);
			}
			else
				break;
		}
	
	}
}
