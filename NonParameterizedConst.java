class NonParameterizedConst
{
	int roll_no;
	int marks1,marks2;//instance variable
	
	
	public NonParameterizedConst()
	{
		int result;
		marks1=90;
		marks2=90;
		roll_no=01;
		result=marks1+marks2;
		System.out.println("result is : "+result);
		System.out.println("calling non-parameterized constructor");
	}
	
	public static void main(String args[])
	{
		NonParameterizedConst obj=new NonParameterizedConst();
		System.out.println("roll_no is :"+" "+obj.roll_no);
		System.out.println("marks1 is:"+obj.marks1+" , "+"marks2 is:"+obj.marks2);
	}
}