class VariableD
{
	public static void main(String srgs[])
	{
	//printing data of different data types
		int a=30,b=40;
		float c=10.5f,d=56.9f;//by default there is double in java instead of float so use valuef for float
		double e=10.2,g=30.4;
		char val1=65,val2=66;//65=A and 66=B ASCII values
		/*
			string in java can be act as both i.e primitive data type and predefined class in java.
			we can declare string using new keyword as well because string is predefined cllass in java.
			Variable of string type will act as an object of predefined class java.
		*/
		String name="Harshada";
		String name1=new String("Harshada Joshi here");
		//**********************************************
		byte b1=7,b2=2;
		short s1=3,s2=4;
		long l1=40,l2=90;
		boolean bool=true;
		System.out.println("a="+a+" , "+"b="+b);
		System.out.println("c="+c+" , "+"d="+d);
		System.out.println("e="+e+","+"g="+g);
		System.out.println("val1="+val1+","+"val2="+val2);
		System.out.println("name is : "+name);
		System.out.println("name1 is: "+name1);
		System.out.println("b1="+b1+","+"b2="+b2);
		System.out.println("s1="+s1+","+"s2="+s2);
		System.out.println("l1="+l1+","+"l2="+l2);
		System.out.println(bool);
		
	}
	
	
}