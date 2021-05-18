import java.util.Scanner;
class LargestAmong4
{
	public static void main(String args[])
	{
		//create object of Scanner class
		Scanner obj=new Scanner(System.in);
		//take 4 numbers from user using object of Scanner class and print those numbers as follows:
		System.out.println("Enter first number :");
		int num1=obj.nextInt();
		System.out.println("num1 is :"+num1);
		
		System.out.println("Enter Second number :");
		int num2=obj.nextInt();
		System.out.println("num2 is :"+num2);
		
		System.out.println("Enter third number :");
		int num3=obj.nextInt();
		System.out.println("num3 is :"+num3);
		
		System.out.println("Enter fourth number :");
		int num4=obj.nextInt();
		System.out.println("num4 is :"+num4);
		
		//conditional statements for largest among 4 numbers
		/*if(num1>=num2 && num1>=num3 &&num1>=num4)
		{
			System.out.println("Largest number is :"+num1);
		}
		else if(num2>=num3 && num2>=num4)
		{
			System.out.println("Largest number is :"+num2);
		}
		else if(num3>=num4)
		{
			System.out.println("Largest number is :"+num3);
		}
		else
		{
			System.out.println("largest number is :"+num4);
		}*/
		//conditional statements for smallest among 4 numbers
		if(num1<=num2 && num1<=num3 && num1<=num4)
		{
			System.out.println("Smallest number is :"+num1);
		}
		else if(num2<=num3 && num2<=num4)
		{
			System.out.println("Smallest number is :"+num2);
		}
		else if(num3<=num4)
		{
			System.out.println("Smallest number is :"+num3);
		}
		else
		{
			System.out.println("Smallest number is ;"+num4);
		}
	}
}