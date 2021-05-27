class StudentMarks1
{
	public static void main(String args[])
	{
		/*
			we want to print sum and average of 5 subjects of 1 student.
			1) take array of marks(that array should contain 5 elements representing marks of 5 subjects)
			2)Take an iterator (say i=0 as array index starts from 0). To travesrese an array we need this iterator.
			3)sum=sum+arr[i];
			4)avg=sum/arr_length
		
		*/
		
		int sum=0,arr_length;
		double avg;
		int[]marks={40,50,60,70,80};
		//calculation of sum of marks
		for(int i=0;i<marks.length;i++)
		{
			sum=sum+marks[i];
		}
		System.out.println(" sum of all 5 subjects is : "+sum);
		//for average calculation we need array length 
		arr_length=marks.length;
		avg=((double)sum/(double)arr_length);
		System.out.println("Average marks of studet are: "+avg);
		
	}
}