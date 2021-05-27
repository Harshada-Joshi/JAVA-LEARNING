class ConstructorOverloading
{
	int roll_no;//instance variables
	String name;
	
	public ConstructorOverloading()
	{
		roll_no=01;
		name="harsha";
		System.out.println("This is non-parameterized constructor");
		System.out.println();
	}
	
	
	
	public ConstructorOverloading(int roll_no)
	{
		this.roll_no=roll_no;
		System.out.println("roll_no is :"+roll_no);
		System.out.println("This is one parameter constructor");
		System.out.println();
	}
	
	
	
	public ConstructorOverloading(int roll_no,String name)
	{
		this.roll_no=roll_no;
		this.name=name;
		System.out.println("Roll_no is :"+roll_no);
		System.out.println("name is :"+name);
		System.out.println("This is two parameter constructor");
		System.out.println();
	}
	
	public static void main(String args[])
	{
		ConstructorOverloading obj1=new ConstructorOverloading(01);//it will call one parameter constructor
		ConstructorOverloading obj2=new ConstructorOverloading(02,"gauri");//it will call two parameter constructor
		ConstructorOverloading obj=new ConstructorOverloading();
		System.out.println("roll_no is:"+obj.roll_no+""+"name is:"+obj.name);//this will call non-parameterized constructor
	}
}