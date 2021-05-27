class Academic
{
	public int marks;//instance variables
	private String name;
	protected String branch;
	
	//create constructor to initialize marks
	
	public void display()
	{
		System.out.println("This is parent class");
	}
	public String getName()
	{
		return name;
		
	}
	public void setName(String name)
	{
		this.name=name;
	
	}	
	
	
}
class Student extends Academic
{
	public int roll_no;
	
	public Student()
	{
		roll_no=9;
	}
	
	
	//methods to access protected members of parent class
	public String getBranch()
	{
		return branch;
	}
	public void setBranch(String branch)
	{
		this.branch=branch;
		
	}
}
class MainClass
{
	public static void main(String args[])
	{
	
		Student obj=new Student();
		obj.display();
		System.out.println("marks : "+obj.marks);
		System.out.println("roll_no : "+obj.roll_no);
		obj.setName("Harsha");
		System.out.println("name:"+obj.getName());
		obj.setBranch("computer");
		System.out.println("branch:"+obj.getBranch());
	}
}
		