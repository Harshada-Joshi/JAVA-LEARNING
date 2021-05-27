class Array1
{
	public static void main(String args[])
	{
		//declaration and initialization of an array in different ways
		int[] arr=new int[4];//declaration of an array
		arr[0]=10;//initialization;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		//accessing array using array index as follows:
		System.out.println("accessing array using array index as follows:");
		System.out.println("arr[0]="+" "+arr[0]);
		System.out.println("arr[0]="+" "+arr[1]);
		System.out.println("arr[0]="+" "+arr[2]);
		System.out.println("arr[0]="+" "+arr[3]);
		
		//accessing array elements using for loop
		System.out.println();
		System.out.println("Printing array elements using simple for loop");
		for(int i=0;i<arr.length;i++)
		{
		System.out.println(arr[i]);
		}
		System.out.println();
		//accessing array elements using Enhanced for loop(for-each loop)
		System.out.println("printing array elements using enhanced for loop");
		for(int item:arr)
		{
			System.out.println(item);
		}
		//accessing array elements using while loop
		System.out.println();
		System.out.println("accessing array elements using while loop");
		int i=0;
		while( i<arr.length)
		{
			System.out.println(arr[i]);
			i++;
		}
		
		
	}
}