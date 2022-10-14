package assignment1;

import java.util.Scanner;

public class Task1SwapTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);     
		System.out.print("Enter first number- ");  
		int a= sc.nextInt();  
		System.out.print("Enter second number- ");  
		int b= sc.nextInt();  
		int c;
//		int a=10;
//		int b=20;
		System.out.println("Input provided are " +a+" and " +b );
		c=a;
		a=b;
		b=c;
		System.out.println("Swapped output is "+a+" and "+b);
		
	}

}
