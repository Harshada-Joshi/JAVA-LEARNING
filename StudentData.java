import java.util.Scanner;
class StudentData
{
	public static void main(String args[])
	{
	/*
		Display following data for 5 students
		1)Roll_no
		2)Name
		3)Division
		4)Branch
	Take only roll_no from user
	
	*/
	//create array of character to store 3 divisions(say A B C)
	char[]division={'A','B','C','D','E'};
	//create array of string to store names of 5 students
	String[]names={"Amit","Radha","Garuri","kunal","harsha"};
	//create string array to store branch of 5 students
	String[] branch={"computer","IT","Civil","Mechanical","Electrical"};
	//create integer array to store roll_number of 5 students
	int[]roll_no={01,02,03,04,05};
	//now write nested for loops to display this information of 5 students
	
	System.out.println("Enter data of 5 students :");
	System.out.println();
	for(int i=0;i<5;i++)//for 5 students(Student count=5)
	{
		
		System.out.println("roll number is: "+roll_no[i]);
		System.out.println("name is : "+names[i]);
		System.out.println("division is : "+division[i]);
		System.out.println("branch is : "+branch[i]);
		System.out.println();
	}
}
		
}