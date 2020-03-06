package mq.corejava.InStantMethods;

public class RobotA 
{
	
	public void ON()
	{
		System.out.println("Robot is ON");
	}
	
	public void OFF()
	{
		System.out.println("Robot is OFF");
	}
	
	public static void main(String args[])
	{
		new RobotA().ON();
		new RobotA().OFF();
		
		//Create object using reference variable
		RobotA obj=new RobotA();
		obj.ON();
		obj.OFF();
	}
	
}
