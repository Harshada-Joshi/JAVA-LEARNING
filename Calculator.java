class Calculator
{
	
		/*
			Implementation of arithemetic calculator using methods for different operations
			1)use add method to perform addition
			2)use sub(),mul(),div() methods to perform subtraction,multiplication and division operations respectively
			3)use non-static methods
			4)use parameterized methods (take int a,int b) parameters for methods
		*/
		public static void main(String args[])
		{	
			int num1=10,num2=20;
			//create object of class Calculator as follows:
			Calculator obj=new Calculator();
			//calling non-static method using object of class
			//int res=obj.add(10,20);
			System.out.println("Addition of given two numbers is : "+obj.add(num1,num2));
			//calling sub method
			System.out.println("Subtraction of given two numbers is : "+obj.sub(num1,num2));
			//calling mul method
			System.out.println("Multiplication of given two numbers is : "+obj.mul(num1,num2));
			//calling div method
			System.out.println("Division of given two numbers is : "+obj.div(num1,num2));
			
			
		}
		public int add(int a,int b)//parameterized non static method
		{
			int result=a+b;
			return result;
		}
		public int sub(int a, int b)
		{
			int result=a-b;
			return result;
		}
		public int mul(int a, int b)
		{
			int result=a*b;
			return result;
		}
		public int div(int a, int b)
		{
			int result=a/b;
			return result;
		}
}