class ShapeArea
{
	public static void main(String args[])
	{
		//create object of given class
		ShapeArea obj=new ShapeArea();
		System.out.println("Area of circle is : "+obj.area(5));
		System.out.println("Area of rectangle is : "+obj.area(5.2,6.7));
		System.out.println("Area of square is : "+obj.area(5.2f));
	}
	//methods
	
	public int area(int r)
	{
		//area of circle
		int result;
		result=((int)3.14*(int)r*r);//converted double to int
		return result;
	}
	public double area(double length,double breadth)
	{
		//area of rectangle
		double result1;
		result1=length*breadth;
		return result1;
	}
	public float area(float side)
	{
		float result3;
		result3=side*side;
		return result3;
	}
}