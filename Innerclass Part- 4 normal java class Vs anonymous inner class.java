
									Innerclass Part- 4||normal java class Vs anonymous inner class
								   =================================================================

 --------------------------------------------
  Normal java class Vs Anonymous inner class 
 --------------------------------------------

 -> A normal java class can extends only one class at time. Ofcource Anonymous inner class also can extends only one 
	at a time.
	
 -> A normal java class can implements any number of interfaces simultaneously but Anonymous inner class can implements
    only one interface at a time.
	
 -> A normal java class can extends  a class and can implements any number of interfaces simultaneously.
 
 -> But anonymous inner class can extends a class or can implements an interface but not both simultaneously.
 
 -> In normal java class we can write any number of constructors.
 
	Ex.
		class Test {
			         
			Test(){  
			         
        	}
        }
		
 -> But a in anonymous inner classes we can't write any constructors explicitly(Because the name of class and name of the 
	constructors must be same but anonymous inner classes not having any name).
	
		Ex.
			Thread t = new Thread()
	        {
	       
	        };
	
 Note: 

	- If the requirement is standar and required several time then we should go for normal top level class.
	
	- If the requirement is temparory and required only once(instance use) then we should go for Anonymous inner class.
	
-----------------------------------------------	
 Where Anonymous inner class are best suitable 
-----------------------------------------------

 -> We can use Anonymous inner classes frequently in GUI based applications to implements event handling. 
 
	class MyGUI extends JFrame 														
	{
		JButton b1,b2,b3,b4,b5...;											-------------------------	
		                                                                    |						|
		                                                                    | ---------- ---------- |	
		                                                                    | |withdraw| |  Print | |
		b1.addActionListener(new ActionListener()                           | ---------- ---------- |
			                                                                | ---------- ---------- |
			{                                                               | |Pinchang| |Passbook| |
				public void actionPerformed(ActionEvent e)                  | ---------- ---------- |
				{                                                           | ---------- ---------- |
					// b1 specific functionality                            | | cancle | | Saving | |
				}                                                           | ---------- ---------- |
			});                                                             -------------------------
			                                                                	ATM GUI Frame 
		
		b2.addActionListener(new ActionListener()          
	    	                                               
	    	{                                              
        		public void actionPerformed(ActionEvent e) 
	    		{                                          
	    			// b2 specific functionality           
        		}                                          
        	});
	}
	
	
    
	import java.awt.*;
	import java.awt.event.*;
	public class JarDemo 
	{
		public static void main(String args[])
		{
			Frame f = new Frame();
			f.addWindowListener(new WindowAdapter()
			{
				public void windownClosing(WindowEvent e)
				{
					for int i = 1; i<=10;i++)
					{
						System.out.println("I am closing window : " +i);
						System.exit(0);
					}
				}
			});
				f.add(new Label("Can I created a Executable Jar file "));
				f.setSize(500,500);
				f.setVisible(true);
			
		}
	}
						
			
===========================    
 4. Static Nested Classes 
===========================

 -> Sometime we can declare inner class with static modifiers such type of inner classes are called static nest classes.

 -> In the case of normal or regular inner class without exisiting outer class object there is no chance of exisiting
	inner class object. That is inner class object strongly associated with outer class object.
	
 -> But in the case of static nested classes without exisiting outer class object there may be chance of exisiting nested 
	class object. Hence a static nested class object is not strongly associated with outer class object.
	
	
	Ex.
	
		class Outer1 {
			
			static class Nested {
				
				public void m1(){
					
					System.out.println("Static nested class method");
				}
			}
			public static void main(String args[])
			{
				Nested n = new Nested();
				n.m1();
			}
		}
	
 -> If you want to create Nested class object from outside of outer class then we can create as follows.

	Outer1.Nested n  = new Outer1.Nested();
	

 -> In normal or regular inner classes we can't declare any static members. But in static nested classes we can declare
	static members including main() method hence a we can invoke static nested class directly from command prompt.
	
	Ex.
 
	class Test {
		
		static class Nested 
		{
			public static void main(String args[])
			{
				System.out.println("Static nested class Main method");
			}
		}
		public static void main(String args[])
		{
			System.out.println("Outer class main method");
		}
	}
	
	java Test 	
		
	  o/p : Outer class main method	.

	java Test$Nested
	
	  o/p : Static nested class Main method	.


 -> From normal or regular classes we can access both static and non-static members of outer class directly but from 
	static nested classes we can access static members of outer class directly and we can't access non-static members.

	Ex.
	
	class Test {
		
		int x = 10;
		static int y = 20;
		
		static class Nested {
			
			public void m1()
			{
				System.out.println(x);//CE: non-statix variable x cannot be refrenced from a static context.
				System.out.println(y);//valid 
			}
		}
	}
				
---------------------------------------------------------------------------
 Differences between normal or regular inner class and static nested class 
---------------------------------------------------------------------------

	------------------------------------------------------------------------------------------------------------
	|		Normal or Regular inner class 			 |					Static Nested class 					|
	|------------------------------------------------|----------------------------------------------------------|
    |1. Without exisiting Outer class object there 	 | 1. Without exisiting Outer class Object there            |
	|   is no chance exisiting inner class object 	 |	 may be  a chance of exisiting static nested 	        |
	|   that is inner class object is strongly 		 |	 class object, that is static nested class              |
	|   associated with outer class object.			 |	 is not strongly associated with Outer class object     |
	|                                                |                                                          |
	|2. In normal or regular inner classes we		 | 2. In static nested classes we can declare static        |
	|   can't declare static members.				 |	 members.                                               |
	|                                                |                                                          |
	|3. In normal or regular inner class we can't 	 | 3. In static nested classes we can declare main() method |
	|   declare main() method and hence a we can't 	 |	 and hence we can invoke nested class directly from     |
	|   invoke inner class directly from command	 |		 command prompt.                                    |
	|   prompt.                                      |                                                          |
	|                                                |                                                          |
	|4. From normal or regular inner classes we can	 |  4. From static nested class we can access only static  	|
	|   access both static and non-static members	 |	  members of outer class.	                            |
	|   of outer class directly.                     |                                                          |
	-------------------------------------------------------------------------------------------------------------



















 

	
	
	
	