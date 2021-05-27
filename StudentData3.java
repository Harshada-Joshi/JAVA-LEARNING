import java.util.Scanner;
class StudentData3
{
	public static void main(String args[])
	{
		/*
			Display following data of 5 students
			1)roll_no
			2)name
			3)Division
			4)Branch
			5)marks
		
		
		*/
		Scanner scr=new Scanner(System.in);
		//I want number of students from user(say n students I want)
		System.out.println("Enter count of students to display record:");
		int n=scr.nextInt();
		//now create array of mentioned size(student count)
		int[]student=new int[n];
		
		
		
		int[]marks=new int[n];
		int[]roll_no=new int[n];
		String[]division=new String[n];
		String[]branch=new String[n];
		String[]name=new String[n];
		
		System.out.println("Enter data of mentioned number of students as follows:");
		System.out.println();
		//use for loop for 5 students
		for (int i=0;i<n;i++)
		{
				System.out.println("Enter name :");
				name[i]=scr.next();
				
				System.out.println("Enter roll_no :");
				roll_no[i]=scr.nextInt();
				
				System.out.println("Enter division :");
				division[i]=scr.next();
				
				System.out.println("Enter branch :");
				branch[i]=scr.next();
				
				System.out.println("Enter marks :");
				marks[i]=scr.nextInt();
				
				System.out.println();
			
		}
	}
}