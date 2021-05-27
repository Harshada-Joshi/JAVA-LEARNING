class DefaultConstructor
{
	int i;//instance variable which is non-static also
	 static String language="java";
	
		public static void main(String args[])
			{
				DefaultConstructor obj=new DefaultConstructor();
				System.out.println("i="+obj.i);
				System.out.println("language is :"+" "+language);//variable is static so object is not required to call it
				/*
					As soon as we create object of class java compiler will call default constructor and this constructor will initialize instance variable.
					Here instance variable "i" is not initialized earlier but when we create object of class it will get initialized by default constructor.
					Output will be default value of int type as earlier we haven't initialize instance variable "i"
				*/
				
			}
}	
	
	
	
	