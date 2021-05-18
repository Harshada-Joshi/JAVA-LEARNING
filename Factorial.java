import java.util.Scanner;
class Factorial
{
	public static void main(String args[])
	{
		//factorial is 5!=5*4*3*2*1=120
		
		int i=1,fact=1,temp;
		/*while(i<=num)
		{
			fact=fact*i;
			i++;
		}
		System.out.println(fact);*/
		Scanner scr=new Scanner(System.in);
		System.out.println("Enter a number :");
		int num=scr.nextInt();
		temp=num;
		while(i<=temp)
		{
			fact=fact*num;
			num--;
			i++;
		}
		System.out.println(" factorial of given number is : "+fact);
	}
}