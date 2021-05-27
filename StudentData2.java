import java.util.Scanner;
class StudentData2
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
		int[]marks=new int[5];
		int[]roll_no=new int[5];
		String[]division=new String[5];
		String[]branch=new String[5];
		String[]name=new String[5];
		
		System.out.println("Enter data of 5 students as follows:");
		System.out.println();
		//use for loop for 5 students
		for(int i=0;i<5;i++)
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