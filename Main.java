class Animal
{
	int legs;//instance variable
	public void sound()
	{
		System.out.println("sound made by animal");
	}
}
class Dog extends Animal
{
	
	//child class method
	public void eat()
	{
		System.out.println("dog eat dogfood");
		super.sound();//calls parent class sound method
			
	}
	//overrided method
	public void sound()
	{
		System.out.println("dog produce a sound called as : barks");
	}
	//child class method
	public void display()
	{
		System.out.println("This is child class");
		System.out.println("legs of animal are :"+legs);
	}
}

  class Main
{
	public static void main(String args[])
	{
		Dog d1=new Dog();
		d1.eat();
		d1.sound();//child class sound method
		d1.legs=4;//initialize instance variable legs from parent class animal
		d1.display();
	}
}