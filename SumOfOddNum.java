import java.util.Scanner;
class SumOfOddNum
{
	public static void main(String args[])
	{
		/*
			calculate sum of odd numbers from 1 to 10
			steps to be followed
			1) if(num%2!=0)-->then that number is an odd number else not
			2) we need an iterator to iterate from 1 to 10 (say i=1 for that) and (n=10) for last term
			3)initially take sum=0; then sum=sum+i 
		*/
		int i=1,sum=0;
		Scanner scr=new Scanner(System.in);
		System.out.println("Enter a number till what you want sum of odd numbers :");
		int n=scr.nextInt();
		while(i<=n)
		{
			if(i%2!=0)
			{
				sum=sum+i;
			}
			i++;
		}
		System.out.println(sum);
	}
}