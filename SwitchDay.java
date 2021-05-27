import java.util.Scanner;
class SwitchDay
{
	public static void main(String args[])
	{
		//int day =2;
		Scanner scr=new Scanner(System.in);
		//menu for picking day of your choice
		System.out.println("Enter day of your choice :");
		for(int i=0;i<=7;i++)
		{
			System.out.println(i);
			
		}
		System.out.println();
		
		int day=scr.nextInt();
		System.out.println("choice entered by you is "+ day +" "+"and day of your choce is :");
		switch(day)
		{
			case 0:
				System.out.println("sunday");
				break;
			case 1:
				System.out.println("monday");
				break;
			case 2:
				System.out.println("Tuesday");
				break;
			case 3:
				System.out.println("wednesday");
				break;
			case 4:
				System.out.println("Thursday");
				break;
			case 5:
				System.out.println("Friday");
				break;
			case 6:
				System.out.println("saturday");
				break;
			default:
				System.out.println("Enter a valid choice");
				
		}
	}
}