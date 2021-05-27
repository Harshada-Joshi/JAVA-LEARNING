class StaticMethod
{
	//use static-parameterized methods here
	public static void main(String args[])
	{
		//create object of class StaticMethod
		StaticMethod obj=new StaticMethod();
		//calling static method add
		System.out.println("Addition of given numbers is :"+add(10,20));
		
	}
	public static int add(int a,int b)
	{
		int result;//It means in static method we can use non-static variable
		result=a+b;
		return result;
	}
}
