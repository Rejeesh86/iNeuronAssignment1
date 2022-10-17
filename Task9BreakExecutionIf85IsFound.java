package assignment1;

public class Task9BreakExecutionIf85IsFoundUpdated 
{

	public static void main(String[] args)
	{	
		int input[] = {12,34,66,85,900};
		
		for (int i=0;i<input.length;i++)
		{
			if (input[i]!=85)
			{
				System.out.println(input[i]);
			}
			else
				break;
		}
		
	}
}
