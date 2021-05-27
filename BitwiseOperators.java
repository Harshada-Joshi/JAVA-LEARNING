class BitwiseOperators
{
	public static void main(String args[])
	{
		int num1=12,num2=25,result;
		//perform operations using bitwise operators as follows:
		//1) Bitwise &(AND) operator
		result=(num1&num2);
		System.out.println("num1&num2 is : "+result);
		//2) Bitwise |(OR) operator
		result=(num1|num2);
		System.out.println("num1|num2 is :"+result);
		//3) Bitwise ^(Ex-or) operator
		result=(num1^num2);
		System.out.println("num1^num2 is :"+result);
		//left shift operator(<<)-->Here we supposed to append number of zeros
		/*
			steps to follow for left shift operation:
			1)convert given decimal number into binary
			2)here binary of 12 is (1100)<<2=1100 00-->append number of zeros like this
			3)we have 110000-->convert this into decimal=48(in this case)
		
		*/
		result=num1<<2;
		System.out.println("12<<2 = "+result);
		//right shift operator(>>)-->Here we supposed to remove number of digits
		/*
			steps to follow for right shift operator
			1)convert given decimal number into binary
			2) here binary of(12) is (1100)-->Remove number of digits here -->(11) will remain in this case of(12)-->1100
			3)Now we have(11)-->convert this into decimal-->3(in this case
		
		*/
		result=num1>>2;
		System.out.println("12>>2 = "+result);
	}
}