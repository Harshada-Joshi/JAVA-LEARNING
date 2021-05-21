class NumberSwap
{
	public static void main(String args[])
	{
		int num1=2,num2=3,temp;
		//swapping of numbers using temporary variable(temp)
		System.out.println("Numbers before swapping are :"+"num1= "+num1+" "+"num2= "+num2);
		temp=num1;//temp=2
		num1=num2;//num1=3
		num2=temp;//num2=2
		System.out.println("Numbers after swapping are :"+"num1= "+num1+" "+"num2= "+num2);
		//Swapping of numbers using(+,-)
		
		System.out.println();
		
		System.out.println("Numbers before swapping are :"+"num1= "+num1+" "+"num2= "+num2);
		num1=num1+num2;//2+3=5=num1
		num2=num1-num2;//num2=5-3=2
		num1=num1-num2;//num1=5-2=3
		System.out.println("Numbers after swapping are :"+"num1= "+num1+" "+"num2= "+num2);
		
		//swapping of number using ex-or operator
		
		System.out.println();
		
		System.out.println("Numbers before swapping are :"+"num1= "+num1+" "+"num2= "+num2);
		num1=num1^num2;
		num2=num1^num2;
		num1=num1^num2;
		System.out.println("Numbers after swapping are :"+"num1= "+num1+" "+"num2= "+num2);
		
		//easiest way to swap numbers
		
		System.out.println();
		
		System.out.println("Numbers before swapping are :"+"num1= "+num1+" "+"num2= "+num2);
		num2=num1+num2-(num1=num2);//num2=5-(3)=2 i.e num2=2 and num1=3
		//b=a+b-(a=b) -->formula for swapping 2 numbers
		System.out.println("Numbers after swapping are :"+"num1= "+num1+" "+"num2= "+num2);
	}
	//here in all cases everytime updated values of num1 and num2 are taken
}