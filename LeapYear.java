import java.util.Scanner;
class LeapYear
{
	public static void main(String args[])
	{
		/*
			check whether given year is leap year or not
			conditions:
			1)year%4==0
			2)year%100==0
			3)year%400==0
			for century leap year it should be divisible by 4,100,400 all three and if it is non centry leap year then it will be divisible by only 4.
			we check 100 for century years like 1900,1800,etc
		*/
		Scanner scr=new Scanner(System.in);
		System.out.println("Enter a year :");
		int year=scr.nextInt();
		if(year%4==0)
		{
			if(year%100==0)
			{
				if(year%400==0)
				{
					System.out.println("given year is a leap year");
				}
				else
				{
					System.out.println("given year is not a leap year");
				}
			}
			else
			{
				System.out.println("given year is a leap year");
			}
		}
		else
		{
			System.out.println("given year is not a leap year");
		}
	}
}