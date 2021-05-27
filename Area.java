class Area
{
	public static void main(String args[])
	{
		//create object of given class
		Area obj=new Area();
		System.out.println("area of square is : "+obj.squareArea(10.2f));
		System.out.println("area of circle is : "+obj.circleArea(10));
		System.out.println("area of rectangle is : "+obj.rectangleArea(10.5,20.3));
	}
	//methods
	public float squareArea(float side)
	{
		float area;
		area=side*side;
		return area;
	}
	public int circleArea(int r)
	{
		int area;
		area=((int)3.14*(int)r*r);//type casting double to int
		return area;
	}
	public double rectangleArea(double length,double breadth)
	{
		double area;
		area=length*breadth;
		return area;
	}
}