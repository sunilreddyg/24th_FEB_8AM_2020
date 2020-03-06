package mq.corejava.Diff_package;

import mq.corejava.ClassMethods.RobotB;
import mq.corejava.InStantMethods.RobotA;

public class Run_ClassMethods_From_Diff_package 
{

	public static void main(String[] args) 
	{
		
		/*
		 * Note:-->
		 * 			Only public modifier methods can
		 * 			call outside package..
		 * 
		 * 			Inorder to call other package class methods
		 * 			we must import package/class reference to 
		 * 			current Constructed class.
		 * 
		 */
		
		//Instant method calling
		new RobotA().ON();
		new RobotA().OFF();
		
		//Static method calling
		RobotB.walk();
		RobotB.run();
		
	
	}

}
