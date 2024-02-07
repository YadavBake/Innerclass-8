
										 Innerclass Part- 2||normal innerclass||regular innerclass
										===========================================================


 -> From Normal or Regular inner class we can access both static and non-static members Outer class directly.
 
	Ex.


	class Outer {
		
		int x = 10;
		static y = 20;
		
		class Inner {
			
			public void m1(){
				
				System.out.println(x);
				System.out.println(y);
			}
		}
		publi static void main(String args[]) {
			
			new Outer().new Inner().m1();
		}
		
	} // 10 
	  // 20 
	 
 -> Within the inner class 'this' always refers current inner class object if we want to refers current outer class object 
	we have to use Outerclassname.this.

	class Outre { // For outer classes applicable modifiers  public <directly> final abstract strictfp 
		
		int x = 10;
		
		class Inner // For outer classes applicable modifiers public,default,final,abstract,strictfp,private,protected,static 
			
			int x = 100;
			
			public void m1(){
				
				int x = 1000;
				System.out.println(x);//1000
				System.out.println(this.x); /*or*/ System.out.println(Inner.this.x) //100
				System.out.println(Outer.this.x);//10
				
			}
		}
		public static void main(String args[]) {
			
			new Outer().new Inner().m1();
		}
	}

 -> The only applicable modifiers for outer classes are public,default, final, abstract, strictfp.

 -> But for inner classes applicable modifiers are public,default, final, abstract, strictfp + private,protected,static.


 --------------------------
  Nesting of Inner classes 
 -------------------------- 

   -> Inside inner class we can declare another innner class that is nesting of inner classes is possible.


		class A {
			
			class B {
				
				class c {
					
					public void m1(){
						
						System.out.println("InnerMost class method");
					}
				}
			}
		}
		
		class Test {
			
			public static void main(String args[]) {
				
				A  a = new A();
				A.B b = a.new B();
				A.B.c c = b.new C();
				c.m1();
			}
		}
		
===============================			
 2. Method Local Inner classes 
===============================

 -> Sometimes we can declare a class in side a method such type of inner classes are called method local inner classes.

 -> The main purpose of method local inner class is to define method specific repitedaly required funcationality.

 -> Method local inner classes are best suitable to meet nest method requirements.

 -> We can access method local inner classes only within the method where we declare outside of the method we can't access.
 
 -> Because of it's less scope method local inner classes are most rearly used type of classes.
 
	Ex 
	
		class Test 
		{
			
			public void m1()  
			{
			
				class Inner 
				{
					public void sum(int x, int y)
					{
						System.out.println("The Sum of : " + (x+y));
					}
				}
				Inner i = new Inner();								output:		
				i.sum(10,20);                                       
				;;;;;;                                              	The Sum of : 30
				i.sum(100,200);                                     	The Sum of : 300
				;;;;;;                                              	The Sum of : 3000
				i.sum(1000,2000);                                   			
			}
			public static void main(String args[])
			{
				
				Test t = new Test();
				t.m1();
			}
		}
		
		
 -> We can declare method local inner class inside both and instance and static methods.		
		
 -> If we declare inner class inside instance method then from that methd local inner class we can access both static 
	and non-static members of outer class directly.
	
 -> If we declare inner class inside static method then we can access only static members of outer class directly
    from that methd local inner class.
	
	
	
	Ex.
			
	class Test 
		{
			
			public void m1()  
			{
			
				class Inner 
				{
					public void sum(int x, int y)
					{
						System.out.println(x); //line -1 CE: non-static varialbe cannot be referenced from static context
											   // if m1() method is static then we will get these compile time error.	
						System.out.println(y);
														output:
					}										  10
				}											  20		
				Inner i = new Inner();
				i.m1(); 
				
			}
			public static void main(String args[])
			{
				
				Test t = new Test();
				t.m1();
			}
		}
				
 
    
    - If we declare m1() method as static then at line - 1 we will get compile time error saying non-static varialbe
	  x cannot be referenced from a static context like a compile time error we get.
	  

**-> From methd local inner class we can't access local varialbes of the method in which we declare inner class. If the 
	 local varialbe declare as final then we can access.
	 
	 Ex.
 
	class Test 
	{
		
		public void m1() 
		{													|     |
															|     |			/* If we declar x final then complier will 
			int x = 10; 									|     | 		   covert varialbe x into value at compile 
															|-----|			   time 		
			class Inner 									|x=10;|			   and after compliting m1 method x is remove 	
			{												-------			   from stack area because it is local varialbe	
															 stack 			   of m1() method.*/
				public void m2()
				{											--------
					System.out.println(x);					|Inner  |.m2(){} 
				}											|class  |
			}												|Object |
			Inner i = new Inner();							--------
			i.m2();											   head 
		}														
		public static void main(String args[]) {
			
			Test t = new Test();
			t.m1();
		}
	} //CE: local varialbe x is accessed from within from within innner class; need to be declare final 
				
				
	- If we declare x as final then we won't get compile time error.
	
 Q.1 Considard the following code ?	
	
	Ex. 

		class Test {
			
			int i = 10;
			static int j = 20;
			publi void m1(){
				
				int k = 30;
				final int m = 40;
				
				class Inner {
					
					public void m2() {
						
						line -1 
					}
				}
			}
		}
	
	- At line -  1 which of the following varialbes we can access directly.
	
		i
		j
		k
		m
		
	 - We can access directly i, j, and m.
	 
	 

 Q.2 If we declare m1() method as static then at line-1 which varialbes we can access directly.

		
		class Test {
			
			int i = 10;
			static int j = 20;
			publi static  void m1(){
				
				int k = 30;
				final int m = 40;
				
				class Inner {
					
					public void m2() {
						
						line -1 
					}
				}
			}
		}
		
		we can access directly j and m. 
	 
    
 Q.3 If we declare m2() method as static then at line which varialbes we can access directly.


	class Test {
			
			int i = 10;
			static int j = 20;
			publi void m1(){
				
				int k = 30;
				final int m = 40;
				
				class Inner {
					
					public static void m2() {
						
						line -1 
					}
				}
			}
		} //CE: 
    
    
     - We will get compile time error because we can't declare static members inside a inner classes.
	 
	 
 -> The only applicable modifiers for method local inner class are: final,abstract,strictfp.

 -> If we are trying to apply any other modifier then we will get compile time error.	 
    
    
    
    
	
    
    
    
    
	
	
	
	
	
	
	
	
	
	
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			