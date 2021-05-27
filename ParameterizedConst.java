class ParameterizedConst
{
	String name; //instance variables
	int roll_no;
	
	public ParameterizedConst(String sname,int r_no)
	{
		name=sname;
		roll_no=r_no;
		System.out.println("This is parameterized constructor");
		System.out.println("name is :"+name);
		System.out.println("roll_no is :"+roll_no);
		
	}
	public static void main(String args[])
	{
		ParameterizedConst obj1=new ParameterizedConst("harsha",01);
		//ParameterizedConst obj2=new ParameterizedConst(01);
		
		
	}
}