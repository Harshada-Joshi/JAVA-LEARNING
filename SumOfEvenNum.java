import java.util.Scanner;
class SumOfEvenNum
{
	public static void main(String args[])
	{
		/*
			calculate sum of all even numbers from 1 to 10.
			stepss to be followed:
			1) if(num%2==0) then only given number is even else not
			2) we need an iterator to iterate from 1 to 10 (say i=1 for that) and n=10(for last term
			3) sum=0(initially) then [sum=sum+i] and finally print(sum)
		
		*/
		int i=1,sum=0;
		Scanner scr=new Scanner(System.in);
		System.out.println("enter number til what you want to calculate sum of even numbers ;");
		int n=scr.nextInt();
		while(i<=n)
		{
			if(i%2==0)
			{
				sum=sum+i;
			}
			i++;
		}
		System.out.println(sum);
	}
}