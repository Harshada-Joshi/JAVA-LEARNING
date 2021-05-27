import java.util.Scanner;
class Fibonacci
{
	public static void main(String args[])
	{
		/*
			Fibonacci series:
			1) It starts from 0 followed by 1
			2) Every next term in fibonacci series is sum of previous two terms
			3)e.g of fibonacci series --> 0,1,1,2,3,5,8,13,21,34...
			4) first_term=0,second_term=1 so, 
			[next_term=first_term +second_term(0+1=1)]-->first iteration
			 for second iteration when we will calculate next_term at that time earliar second_term becomes first_term(first_term=second_term)
			 and earliar next_term becomes second_term(second_term=next_term)
			 i.e in nutshell we have 2 conditions which will takes place repeatedly as follows:
			 1) first_term=second_term
			 2)next_term=second_term
			 
		*/
		int first_term=0,second_term=1,i=1,next_term;
		//i=1 means starting point is from 1
		//n=10 means we want to print fibonacci series till 10 terms
		Scanner scr=new Scanner(System.in);
		System.out.println("Enter number of terms for fibonacci series :");
		int n=scr.nextInt();

		while(i<=n)
		{
			System.out.print(first_term+"  ");
			next_term=first_term+second_term;
			first_term=second_term;
			second_term=next_term;
			i++;
		}
	}
}