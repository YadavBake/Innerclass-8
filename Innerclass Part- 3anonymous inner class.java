
											Innerclass Part- 3||anonymous inner class
										  ============================================

 ------------------------
  Anonymous Inner class 
 ------------------------

 -> Sometimes we can declare inner class without name such type of inner classes are called anonymous inner classes.
 
 -> The main purpose of anonymous inner classes is just for instance use (One time uses).
 
 -> Based on declaration and behaviour there are three type of Anonymous inner classes.
 
		1. Anonymous Inner class that extends a class.
		
		2. Anonymous Inner class that implements an interface.
		
		3. Anonymous Inner class that defined inside arguments.
		
 -> 


	Popcorn p = new Popcorn();
	
	Popcorn p = new Point ();
	---------  --------------
	|<-Popcorn	|<- creating Popcorn object  	
	   class
	   
	{|/*1.It is Anonymous class.
	 |2.we are declaring a class that extends Popcorn class without name such type of class are called Anonymous class. 
	};|
	- Here we creating child class for Popcorn without name for that child class we are creating an object with parent 
	  reference.*/
	  
	Thread t = new Thread();

	Thread t = new Thread 
	{|/*1.It is Anonymous class.
	|2.we are declaring a class that extends Thread class without name such type of class are called Anonymous class.
	};|
	- Here we creating child class for Thread without name for that child class we are creating an object with parent 	
	  reference.*/
  
	
	Runnable r = new Runnable()
	{
		
	};
	
	/*- In Runnable interface we cannot take semicolne ';' at the end because we will compile time error. Because Runnable
       is interface and we can't create object for Runnable interface.

	- Here we are writing class that implements Runnable interface without name such type of class is nothing but Anonymous 
	  class and for that implements class we are creating a object with interface reference.*/
	
 	
	Ex . 
	
	class Popcorn 									
	{                                               
		public void teste()                         
		{                                           
			System.out.println("salty");            
		}                                           
		//1oo more method are there.                
	}                                               
	                                                
	/*clas SubPopcorn extends Popcorn                                                 
	{
		
		public void Test()
		{
			System.out.println("spicy");
		}
		//1oo more method are copy as it is.
	} // but we have spicy method is only one time requirement 
	  // then we don't want to go with this approach.*/
	

	class Test2 {
		
		public static void main(String args[]) 
		{
			
			Popcorn p = new Popcorn()							Output:
			{                                                   
				public void teste()                             spicy
				{                                               salty
					System.out.println("spicy");                sweet
				}                                               Test2$1
			};                                                  Popcorn
			p.teste(); //spicy                                  Test2$2	
			
			Popcorn p1= new Popcorn();							//how much class file will be create 	
			p1.teste();//salty
																Popcorn.class
			Popcorn p2 = new Popcorn()							Test.class
			{													Test$1.class
				public void teste()								Test$2.class		
				{
					System.out.println("sweet");
				}
			};
			p2.teste();//sweet
			System.out.println(p.getClass().getName());
			System.out.println(p1.getClass().getName());
			System.out.println(p2.getClass().getName());
			
		}
	}
	
	
  Analysis
 ----------

	1. Popcorn p = new Popcorn();
	
		- Just we are creating Popcorn object.
		
	2. Popcorn p = new Popcorn
	   {
	   };
	   
	   1. We are declaring a class that extends Popcorn without name(Anonymous inner class).
	   
	   2. For that child class we are creating an objet with parent reference.
	   
	3. Popcorn p = new Popcorn()
	   {
		  public void teste()
		  {
			  System.out.println("spicy");
		  }
	   };
	   
	   1. We are declaring a class that extends Popcorn without name(Anonymous inner class).
	   
	   2. In that child class we are overriding teste() method.
	   
	   3. For that child class we are creating an objet with parent reference.

 ---------------------------------------------
  Defining a thread by extending thread class 
 ---------------------------------------------

														Normal class Approach													
													   =======================			

	class MyThread extends Thread <--------------------------------
	{												  			   |			
		public void run()							  			   |	
		{														   |	 	
			for (int i = 0; i<10; i++)<-------------               |//Defining a Thread.
			{									   |/*It is a job  | 	
				System.out.println("Child Thread");| of a thread*/ | 
			}<--------------------------------------			   |	
		}														   |	
	}<--------------------------------------------------------------

	class ThreadDemo {
		
		public static void main(String args[]){
			
			MyThread t = new MyThread();
			t.start();
			
			for(int i = 0; i<10; i++)
			{
				System.out.println("Main Thread");
			}
		}
	}



										Anonymous Inner class Approach 
									  =================================
									  
									  
	class ThreadDemo {
		
		public static void main(String args[])
		{
			
			Thread t = new Thread()
			{
				public void run()
				{
					for(int i = 0; i<10; i++)
					{
						System.out.println("Child Thread");
					}
				}
			};
			t.start();
			
			for(int i = 0; i<10;i++)
			{
				System.out.println("Main Thread");
			}
		}
	}
			
-------------------------------------------------------
  Anonymous Inner class that implements an interface
-------------------------------------------------------  

 -> Defining thread by implementing Runnable interface.
 
		

												Normal class Approach
                                                =====================

   class MyRunnable implements Runnable <---------------------------
   {												  			   |			
		public void run()							  			   |	
		{														   |	 	
			for (int i = 0; i<10; i++)<-------------               |//Defining a Thread.
			{									   |/*It is a job  | 	
				System.out.println("Child Thread");| of a thread*/ | 
			}<--------------------------------------			   |	
		}														   |	
   }<--------------------------------------------------------------
  
	class ThreadDemo {
	   
	   public static void main(String args[])
	   {
		   MyRunnable r = new MyRunnable();
		   Thread t = new Thread(r);
		   t.start();
		   for(int i = 0; i<10;i++)
		   {
           	System.out.println("Main Thread");
           }
	   }
   }
   


	
    									Anonymous Inner class Approach 
    								  =================================
    								  
    								  
    class ThreadDemo1 {
    	
    	public static void main(String args[])
    	{
    		Runnable r = new Runnable()
    		{
    			public void run()
    			{
    				for(int i = 0; i<10; i++)
    				{
						System.out.println("Child Thread");   
					}
				}
			};
			Thread t = new Thread(r);
			t.start();
			
    		for(int i = 0; i<10;i++)
    		{
    			System.out.println("Main Thread");
    		}
    	}
    }


-----------------------------------------------
 Anonymous Inner that define inside arguments
-----------------------------------------------

	class ThreadDemo 
	{
		public static void main(String args[])
		{
			new Thread(new Runnable()
								{
									public void run()
									{
										for(int i = 0; i<10;i++)
										{
                                        	System.out.println("child Thread");
                                        }
									}
								}).start();
						
				for(int i = 0; i<10;i++)
                {
                   	System.out.println("Main Thread");
                }
		}
	}















	  