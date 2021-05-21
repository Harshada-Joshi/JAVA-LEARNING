 import java.util.Scanner;
 class SwitchStringDay
 {
	 public static void main(String args[])
	 {
		 //String day="monday";
		 Scanner scr=new Scanner(System.in);
		 System.out.println("Enter day of your choice:");
		 //create an array of string type to store days in it
		 String[] arr={"1.sunday","2.monday","3.tuesday","4.wednesday","5.thursday","6.friday","7.saturday"};
		 
		 
		 for(int i=0;i<arr.length;++i)
		 {
			 System.out.println(arr[i]);
		 }
		 System.out.println();
		 
		 String day=scr.next();
		 
		 switch(day)
		 {
			case "1.sunday" :
				System.out.println("Hey! Today is sunday and it's holiday.");
				break;
			case "2.monday" :
				System.out.println(" It's monday morning");
				break;
			case "3.tuesday" :
				System.out.println("tuesday is really boring day");
				break;
			case "4.wednesday" :
				System.out.println("On wednesday I will go to park");
				break;
			case "5.thursday" :
				System.out.println("It's thursday and I'm going for a movie");
				break;
			case "6.friday" :
				System.out.println("I'm gonna sleep whole day on friday");
				break;
			case "7.saturday" :
				System.out.println("yey! It's saturday");
				break;
			default :
				System.out.println("Enter valid choice");
				
				
		 }
		 
	 }
 }
			 
			