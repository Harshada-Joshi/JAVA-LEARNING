import java.util.Scanner;
class CollinearPoints
{
	public static void main(String args[])
	{
		int area,s1,s2,s3;
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter first point co-ordinates x1 and y1 :");
		int x1=obj.nextInt();
		int y1=obj.nextInt();
		System.out.println("x1= "+x1+" ,"+"y1= "+y1);
		
		System.out.println("Enter second point co-ordinates x2 and y2 :");
		int x2=obj.nextInt();
		int y2=obj.nextInt();
		System.out.println("x2= "+x2+" ,"+"y2= "+y2);
		
		System.out.println("Enter third point co-ordinates x3 and y3");
		int x3=obj.nextInt();
		int y3=obj.nextInt();
		System.out.println("x3= "+x3+" ,"+"y3= "+y3);
		
		//calculation of slope
		/*
			from 3 points 3 slopes will be genereted and among these 3 slopes if  at least 2 slopes are equal then points are collinear else not
		*/
		s1=(y2-y1)/(x2-x1);
		System.out.println("slope1 is :"+s1);
		s2=(y3-y2)/(x3-x2);
		System.out.println("slope2 is :"+s2);
		s3=(y3-y1)/(x3-x1);
		System.out.println("slope3 is :"+s3);
		//conditinal statements
		if(s1==s2)
		{
			if(s2==s3)
			{
				if(s3==s1)
				{
					System.out.println(" Given points are collinear");
				}
				else
				{
					System.out.println(" Given points are collinear collinear");
				}
			}
			else
			{
				System.out.println(" given points are non-collinear");
			}
		}
		else
		{
			System.out.println(" given points are non-collinear");
		}
		
			
				
		
		
	}
	
}