class Person
{
	int age=10;//instance variable
	public void display(int age)
	{
		this.age=age;
		System.out.println("age is:"+age);
		System.out.println("person can be male or female");
	}
}
class Male extends Person 
{
	String name;//instance variable
	public void info(String sname)
	{
		name=sname;
		System.out.println("name is :"+name);
		super.display(10);
		
	}
	
	public void display()
	{
		System.out.println("This is child class:male");
	}
}
class Female extends Male
{
	//int count;
	int salary; //instance variable
	int count;
		public Female()
		{
			count=10;
		}
	public void display(int s)
	{
		salary=s;
		System.out.println("salary is :"+salary);
	}
	public void disp()
	{
		
		System.out.println("non-parameterized method:");
	}
}
class Main1
{
	public static void main(String args[])
	{
	Female obj=new Female();
	//obj.name="harsha";
	
	obj.display();//child class display of male
	obj.info("harsha");
	obj.display(10000);//call display of female
	obj.disp();
	System.out.println("count is :"+obj.count);
	}
}