package mq.corejava.ClassMethods;

public class RobotB 
{
	//public modifier allow method to access outside package..
	public static void walk()
	{
		System.out.println("Walk method executed");
	}
	
	public static void run()
	{
		System.out.println("run method executed");
	}

	public static void main(String[] args) 
	{
		//Calling Static Specifier method with in class
		walk();
		run();

	}

}
