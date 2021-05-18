import java.util.Scanner;
class Palindrome
{
	public static void main(String args[])
	{
		/*
			Palindrome number is the one whose reveresed is equal to the original number 
			i.e OriginalNumber==ReversedNumber.
			To find revere of a number first we need to find last digit of that number using (num%10)
			After that we need to remove that last digit from number by using (num/10).
			and this process of finding indivisual digits will keep going untill we reach to first digit of that number.
			Formula for finding reverse number: rev=(rev*10)+remainder
		*/
		int rem,rev=0,temp;
		Scanner scr=new Scanner(System.in);
		System.out.println("Enter a number to check it is palindrome or not : ");
		int num=scr.nextInt();
		temp=num;
		while(num>0)
		{
			rem=num%10;
			rev=(rev*10)+rem;
			num=num/10;
		}
		if(temp==rev)
		{
			System.out.println("Number is palindrome");
		}
		else
		{
			System.out.println("Number is not palindrome");
		}
		
	}
}