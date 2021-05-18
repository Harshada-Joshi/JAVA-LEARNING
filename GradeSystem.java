import java.util.Scanner;
class GradeSystem
{
	public static void main(String args[])
	{
		/* If marks>=75 print distinction
			if marks>=60 print First class
			if marks<60 print second class
			if marks=40 print pass
			if marks>=30 and marks<40 print can reappear for exam
			else print fail
		
		*/
		System.out.println("Enter marks of student :");
		/*
			to take input from user follow these steps:
			1)import java.util.Scanner --here Scannner is predefined class in java
			2)create object of Scanner class using new keyword --(System.in)-->this is parameter which enables to take input from standard input library
			3)by using that object of Scanner class take input from user.
			-->For different data types different methods are available to take input from user. For integer nextInt() method is there<--
		*/
		Scanner obj=new Scanner(System.in);
		int marks=obj.nextInt();
		System.out.println("marks are :"+marks);
		//conditional statements
		if(marks>=75)
		{
			System.out.println("Congrats! you're passed with distinction");
		}
		else if(marks>=60 && marks<75)
		{
			System.out.println("you're passed with first class");
		}
		else if(marks<60 && marks>40)
		{
			System.out.println("Second class");
		}
		else if(marks==40)
		{
			System.out.println("passing marks");
		}
		else if(marks>=30 && marks<40)
		{
			System.out.println("You can reappear for exam");
		}
		else
		{
			System.out.println("Sorry! better luck next time");
		}
		
	}
}