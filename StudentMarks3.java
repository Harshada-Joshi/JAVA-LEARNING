import java.util.Scanner;
class StudentMarks3
{
	public static void main(String args[])
	{
		/*
			calculate sum/avg of 5 students and each student having 5 subjects
			1) we have marks of 5 subjects so take an int array for marks to store marks of 5 subjects
			2)we have 5 students, so we need to iterate from 0 to 4 (as array index starts from 0 to size-1
			3)we want to take marks of 5 subjects from user.
		
		*/
		int sum=0;
		double avg;
		//create an object of scanner class
		Scanner scr=new Scanner(System.in);
		//mention how many array elements you want in your array(say n)
		System.out.println("Enter marks of how many subjects you want in your array");
		int n =scr.nextInt();
		//create array of mentioned size
		int[] marks=new int[n];
		System.out.println("marks of " + n +" "+ "subjects are :");
		//we have 5 students i.e from 1 to 5 so take j=1 to 5 
		for(int j=1;j<=5;j++)
		{
			System.out.println("marks of student no. "+j+" : ");
				for(int i=0;i<n;i++)
				{
					marks[i]=scr.nextInt();
					sum=sum+marks[i];
				}
			System.out.println("Sum of marks is :"+sum);
		}
		
		
	}
}