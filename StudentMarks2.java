import java.util.Scanner;
class StudentMarks2
{
	public static void main(String args[])
	{
		/*
			we want to calculate marks of 5 subjects of 1 student
			1) we want to take marks of 5 subjects from user.
			2) First mention how many array elements you want in your array(say n)
			3)Take those array elements from user using Scanner class.
			4)Declare an array of mentioned size(n)
			5)use for loop from i=0 to n to calculate sum of marks.
			6)sum=sum+arr[i];
			7)arr[i]=n.nextInt();-->use this in for loop to take input of an array from user.
		*/
			int sum=0,arr_len;
			double avg;
			//create object of scanner class
			Scanner scr=new Scanner(System.in);
			//mention how many array elements you want in your array(say n) so take those elements from user as follows:
			System.out.println("Enter number of elements in your array:");
			int n=scr.nextInt();
			//crreate array of mentioned size(here n)
			int[] arr=new int[n];
			System.out.println("array elements of mentioned size are as follows:");
			//now use for loop for calculation of sum of an array elements
			for(int i=0;i<n;i++)
			{
				arr[i]=scr.nextInt();//to take array elements from user
				sum=sum+arr[i];
			}
			System.out.println("Sum of array elements is : "+sum);	
			arr_len=arr.length;
			avg=((double)sum/(double)arr_len);
			System.out.println("Average of array elements is :"+avg);
		
		
	}
}