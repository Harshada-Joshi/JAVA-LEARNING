class TwoDimArray
{
	public static void main(String args[])
	{
		//create 2D array as follows:
		int [][]arr	=	{
						{1,2,3,4},
						{5,6,7,8},
						{8,9,1,2}
						}; //here 3 rows=no.sets and 4 cols i.e 4elements in indivisual array we have created
		//access indivisual array using arr[0],arr[1],arr[2]. use for loop for it
			System.out.println("length of first row is : "+arr[0].length);//4
			
			//access any random number from given 2D array
			System.out.println("first row second element is :"+arr[0][2]);//3
			
			//access all elements of given 2D array
			System.out.println("all elements of given 2D array are:");
			for(int i=0;i<arr.length;i++)//for accessing indivisual array i.e from 0,1,2 (size is 3)
			{
				for(int j=0;j<arr[i].length;j++)//for accessing indivisual array elements i.e from 0,1,2,3
				{
					System.out.print(arr[i][j]+" ");
					
				}
				System.out.println();
			}
			System.out.println();
			//getting count of 3 indivisual array 
			
			System.out.println("Count of indivisual arrays in given 2D array is : "+arr.length);	//3	
			
			
			
	}
}