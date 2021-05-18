class PerfectNumber
{
	public static void main(String args[])
	{
		/*
			perfect number is the one whose summationof factors will be same as that of original number.
			Steps to be followed to check perfect number:
			1) find factors of number:(num%i==0) where i is an incrementor,then that number will be factor of given number.
			2) check sum of factors using [sum=sum+i];
			3)After calculating sum check [sum==num] if yes then number is perfect number else not.
		
		*/
		int num=496,i=1,sum=0;
		//logic for finding factors of number (num%i==0)-->if satisfies then it is factor of given number
		//once it is factor calculate sum=sum+i;(0+i) i.e  every factor addition will be stored in sum
		//check sum==num
		
		while(i<=num/2)
		{
			if(num%i==0)
			{
				sum=sum+i;
			}
			i++;
		
		}
		if(sum==num)
		{
			System.out.println("Given number is perfect number:");
		}
		else
		{
			System.out.println("Given number is not perfect number");
		}
	}
}