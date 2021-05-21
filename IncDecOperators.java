class IncDecOperators
{
	public static void main(String args[])
	{
		int i=5,j;
		//pre increment/decrement
		j=++i;
		System.out.println(j);//it will output 6 i.ej=6,i=6 now
		/*
			in pre increment/decrement (++i/--i) value is first incremented/decremented and then assigned
			in post increment/decrement(i++/i--) value is first assigned and then incremented/decremented
			
		*/
		j=--i;
		System.out.println(j);//it will output 5 i.e j=5,i=5 now
		//post increment/decrement
		j=i++;
		System.out.println(j);//it will output 5 i.e j=5,i=6 now
		j=i--;
		System.out.println(j);//it will output 6 i.e. j=6,i=5 now
		
	}
}