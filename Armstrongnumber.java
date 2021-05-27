class ArmstrongNumber
{
	public static void main(String args[])
	{
		/*
			Armstrong number is the one whose addition of cubes of indivisual digits of that given number is equal to original number
			steps to be followed:
			1)get indivisual digit of that number using (rem=num%10) and (num=num/10)
			2) calculate sum of cubes of indivisual digits [sum=sum+rem*rem*rem]
			3)If sum==num then given number is armstrong number else not
			
		*/
		int num=153,rem,sum=0,temp,i=1;
		temp=num;
		while(num>0)
		{
			if(i<=num)
			{
				rem=num%10;
				num=num/10;
				sum=sum+rem*rem*rem;
			
			}
			i++;
		}
		if(temp==sum)
		{
			System.out.println(" given number is armstrong number");
		}
		else
		{
			System.out.println(" Given number is not an not armstrong number ");
		}
	}
}