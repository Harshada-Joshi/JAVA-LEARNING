import java.util.Scanner;
class AccessIndivisualDigit
{
	public static void main(String args[])
	{
		//Code to access indivisual digit of any number
		/*
			steps to be followed:
			1) find remainder using num%10-->from this we will get last digit of that number
			2) To remove current last digit use num/10
			3) process of (num%10) and (num/10) keep going on until we get first digit of that given number.
		*/
		int rem,temp,i=1;
		//temp variable is ued to store initial value of num.
		//i variabble is used as starting point.
		Scanner scr=new Scanner(System.in);
		System.out.println("enter a number here :");
		int num=scr.nextInt();
		temp=num;
		while(num>0)
		{
			rem=num%10;
			System.out.print(rem+" ");
			num=num/10;
			
		}
		
		
		
	}
}