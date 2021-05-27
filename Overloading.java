class Overloading
{
	public static void main(String args[])
	{
		//create object of given class
		Overloading obj=new Overloading();
		System.out.println("Addition of 2 integer values : "+obj.add(10,20));
		System.out.println("Addition of 3 integer values : "+obj.add(50,60,70));
		System.out.println("Addition of 2 double values : "+obj.add(10.6,20.8));
	}
	//methods
	
	public int add(int a, int b)
	{
		int result;
		result=a+b;
		return result;
	}
	public int add(int x , int y , int z)
	{
		int result1;
		result1=x+y+z;
		return result1;
	}
	public double add(double a, double b)
	{
		double result2;
		result2=a+b;
		return result2;
	}
}