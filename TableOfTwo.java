import java.util.Scanner;
class TableOfTwo
{
	public static void main(String args[])
	{
		/*
			table of given number
		*/
		int n=10,i=1,tbl;
		Scanner scr=new Scanner(System.in);
		System.out.println("Enter a number whose table you want to print:");
		int num=scr.nextInt();
		System.out.println("table of given number is : ");
		while(i<=n)
		{
			tbl=num*i;
			System.out.println(tbl);
			i++;
		}
	}
}