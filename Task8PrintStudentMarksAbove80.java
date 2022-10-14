package assignment1;

import java.util.Scanner;

public class Task8PrintStudentMarksAbove80 {

	public static void main(String[] args) 
	{
		int n; // enter how many values are needed for verification
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of marks you want to verify: "); 
		n=sc.nextInt();
		
		int [] Marks = new int [n]; // enter the marks one by one
		System.out.println("Enter each students mark : "); 
		for (int i=0;i<n;++i)
		{
			Marks[i] =sc.nextInt();
			
		}
		
		System.out.println("Marks greater than 80 are below : "); 
		for (int i=0;i<n;++i)
		{		
				if (Marks[i]>80)
				{
					System.out.println(Marks[i]+" ");
				}
				
		}
		
	}

}
