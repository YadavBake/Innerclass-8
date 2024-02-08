
									  Innerclass Part- 5||nested classes and interfaces
									 ===================================================
									 
 ------------------------------------------------------									 
  Various Combination of Nested classes and interfaces 
 ------------------------------------------------------

  Case 1: class inside a class:
  
	- Without exisiting one type of object if there no chance exisiting another type of objec then we can declare a 
	  class inside a class.
	  
		Ex.	University consist of several departments. Without exisiting university there is no chance exisiting departments
			hence a we have to declare departments class inside university.		
	
					class University {
						
						class Department {
							
						}
					}
	
	
  Case 2: Interface inside a class :

	- Inside a class if we required multiple implementations of an interface and all these implementations are related 
	  to a particular class then we can define interface inside class.
	  
	  Ex. 
	
		class VehicalTyeps 
		{
			interface vehical
			{
				public int getNumberWheels();
				
			}
			
		class Bus implements Vehical 
		{
			public int getNumberWheels()
			{
				return 6;
			}
		}
		
		class Auto implements Vehical 	
        {
        	public int getNumberWheels()
        	{
        		return 3;
        	}
        }
		.
		.
		.
	}
	

 Case 3: interface inside interface 	
	
	 - We can declare interface inside interface.
	 
		Ex. A Map is group of key-value pair and each key-value pair is called an entry. With exisiting Map object there 
			no chance of exisiting Entry object. hence interface entry is define inside Map interface.
		
		Ex. 											  Key   Value 	
													  ------------------  		
		interface Map 							      | -------------  |
		{                                             | |101 | Durga|<-|---//Sing Entry
			                                          | -------------  |
			interface Entry                           | -------------  |
			{                                         | |102 | Shiva|  |
			}                                         | -------------  |
		}                                             |	-------------  |
                                                      | |102| Reeta |  |
                                                      |  ------------- |
                                                      |	-------------  |
                                                      |	|104 | Sitaa|  |
                                                      | -------------  |
		                                              -----------------
				                                
 -> Every interface prasent inside interface is always public and static whether we are declaring or not hence a we can 
	implement inner interface directly without implementing outer interface.
	
	Similarly whenever we are implementing outer interface we are not required implement innner interface that is we can 
	implement outer and inner interfaces independantly.
	
	
	Ex.
		interface Outer 
		{
			public void m1();
			
				interface Inner 
				{
					public void m2();
					
	            }
		}
                     
		class Test1 implements Outer
		{
			
			public void m1()
			{
				System.out.println("Outer interface method implementations");
			}
		}
		
		class Test2 implements Outer.Inner
		{
			
			public void m2()
			{
				System.out.println("Inner interface method implementations");
			}
		}
                                                
                                                
		class Test 
		{
			public static void main(String args[])
			{
				Test1 t1 = new Test1();
				t1.m1();
				Test2 t2 = new Test2();
				t2.m2();
			}
		}
                                                
												  
  Case 4: class inside interface 
  
	- If funcationality of class closaly associated with interface then it is higly recomanded to declare class inside 
	  interface
	  
	
	Ex.
	
	 interface EmailService 
	 {
		 public void sentMail(EmailDetails e);
		
		class EmailDetails 
		{
			String to_list;
			String cc_list;
			String Subject;
			String body;
		}
	 }
	 
	 - In the above example EmailDetails is required only for EmailService and we are not using any where else hence 
	   EmailDetails class is recomanded to declare inside EmailService interface.
	
 
 -> We can also define a class inside interface to provide default implementation for that interface.	
	
	Ex.
	
	
		interface Vehical
		{
			public int getNumberWheels();
			
			class DefaultVehical implements Vehical
			{
				public int getNumberWheels()
				{
					return 2;
				}
			}
		}
		
		class Bus implements Vehical
		{
			public int getNumberWheels()
			{
				return 6;
			}
		}
		
		Class Test 
		{
			public static void main(String args[])
			{
				Vehical.DefaultVehical d  = new Vehical.DefaultVehical();
				System.out.println(d.getNumberWheels());//2
				
				Bus b = new Bus();
				System.out.println(b.getNumberWheels(6));//6
			}
		}
		
		
		- In the above example default Vehical is the default implementation of vehical interface where as Bus is 
		  Customized implementation of Vehical interface.
		  
		  
 NOte:

	- The class which is declare inside interface is always public static whether we are declaring or not hence a 
	  we can create class object directly without having outer interface type object.
	  
	  
 Conclusion:
 
	1. Among classes and interfaces we can declare anything inside anything.

	
	class A 			class A 			interface A 		interface A 
	{                   {                   {                   {
		class B         	interface B     	interface B     	class B 
		{               	{               	{               	{
		}               	}               	}               	}
	}                   }                   }                   }
			
	
	2. The interface which is declare inside interface is always public and static whether we are declaring or not.
	
	3. The class which is declare inside interface is always public and static whether we are declaring or not.
	
	4. The interface which is declare inside class is always static but need not be public 