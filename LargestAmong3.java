import java.util.Scanner;
class LargestAmong3
{
	public static void main(String args[])
	{
		
		/*
			take 3 numbers from user and print largest and smallest among those 3 numbers
		*/
		//create object of Scanner class
		Scanner obj=new Scanner(System.in);
		//using object take input from user;
		System.out.println("Enter first number:");
		int num1=obj.nextInt();
		System.out.println("num1 is :"+num1);
		
		System.out.println("Enter second number:");
		int num2=obj.nextInt();
		System.out.println("num2 is :"+num2);
		
		System.out.println("Enter third number:");
		int num3=obj.nextInt();
		System.out.println("num3 is :"+num3);
		
		//conditional statements for largest number among 3 numbers
		/*if(num1>=num2 && num1>=num3)
		{
			System.out.println("largest number is :"+num1);
		}
		else if(num2>=num3)
		{
			System.out.println("Largest number is :"+num2);
		}
		else
		{
			System.out.println("Largest number is :"+num3);
		}*/
		//conditional statements for smallest number among 3 numbers
		if(num1<=num2 &&num1<=num3)
		{
			System.out.println("Smallest number is :"+num1);
		}
		else if(num2<=num3)
		{
			System.out.println("Smallest number is :"+num2);
		}
		else
		{
			System.out.println("Smallest number is :"+num3);
		}
		
	}
}