
												Innerclass Part- 1||Introduction
											 =====================================
---------------
 Inner classes 
---------------

 -> Some times we can declare a class inside another class such type of classes are called inner class.

	Ex.

	class Test {
		
		class A {
			
		}
	}

 -> Inner classes concept introduced in 1.1v version  to fix GUI bugs as the part of event handling but because of power 
	feture and benifits of inner classes slowly programmer started using in regular coding also.

 -> Without exisiting one type of object if there is no chance of exisiting another type of object then we should go for 
    inner classes.
	
    Ex 1. University consist of several dipartments withuot exisiting University there is no chance of exisiting 
		  dipartment hence a we have to declare dipartment class in inside University class.
		  
		  
		
				|<------------Outer class 
		class University {
			
			class Dipartment {
					|<-------------inner class 
				
			}
		}
 	
	
	Ex 2. Without exisiting car object there is no chance of exisiting engine object hence a we have to declare Engine 
		  class inside Car class.
	
			  
        
        		|<------------Outer class 
        class Car {
        	
        	class Engine {
        			|<-------------inner class 
        		
        	}
        }
		
		
	Ex 3. Map is group of key values pairs and each key,value pair is called an entry. Without exisiting Map object there 
		  no chance of exisiting Entry object hence a interface Entry is define inside Map interface.
	
	
				 |<---- outer interface 							  Key   Value 	
	   inteface Map {                                             ------------------  
                                                                  | -------------  |
			inteface Entry {                                      | |101 | Durga|<-|---//Sing Entry 
				      |<------- inner inteface                    | -------------  |
				                                                  | -------------  |
			}                                                     | |102 | Shiva|  |
	   }                                                          | -------------  |
	                                                              |	-------------  |
	                                                              | |102| Reeta |  |
	                                                              |  ------------- |
	                                                              |	-------------  |
	                                                              |	|104 | Sitaa|  |
	                                                              | -------------  |
	                                                              -----------------
    
 Note: 
 
	1. Without exisiting outer class object there is no chance of exisiting inner class object.
	
	2. The relation between outer class and inner class is not IS-A relation and it is HAS-A relationship.
	   (Composition or Aggregation).
	   

 -> Based on position of declaration and biheviour all inner class are divided into four types.	
	
	
	1. Normal or Regular Inner class.
	
	2. Method Local Inner class.
	
	3. Anonymous Inner class.
	
	4. static Nested classes.
	
 
 ------------------------------------
   1. Normal or Regular Inner class.
 ------------------------------------  
 
	-> If we are declaring any named class direectly inside a class withuot static modifier such type of inner class is 
	   called Normal or Regular Inner class.
	   
	   Ex.
																		
		class Outer {                                                   		javac Outer.java
			---------------                                             			  |
			|class Inner {|                                             	------------------------		
			|			  | //-->Normal or Regular Inner class.	        	|					   |
			|}			  |                                               Outer.class 	  Outer$Inner.class	
			---------------                                             
		}	                                                            
                                                                        java Outer 
	                                                                    
	                                                                     // RE: NoSuchMethodError:main
	                                                                    
	                                                                    java Outer$Inner
	                                                                    
			 	                                                        // RE: NoSuchMethodError:main

		Ex.
		
			class Outer {												 		javac Outer.java		
				                                                         			  |
				class Inner {                                            	------------------------		
					                                                     	|					   |
				}                                                          Outer.class 	  Outer$Inner.class	
				public static void main(String args[]){                  
					                                                     
					System.out.println("Outer class Main method ");       java Outer 
				}                                                        
				                                                          Outer class Main method
			}                                                            
					                                                     java Outer$Inner
					                                                     
	                                                                     // RE: NoSuchMethodError:main
																		 
																		 
 -> Inside inner class we can't declare any static members hence a we can't declare main() method and we can't run inner 
	class directly from command prompt.

	Ex.

		class Outer {
			
			class Inner {
				
					public static void main(String args[]){
						
						System.out.println("Inner class Main method");
					}
			}
		}
		
		//CE: Inner classes cannot have static declarations 

	
  Case 1: Accessing inner class code from static of Outer class .
  
	Ex.
 
	class Outer {
		
		class Inner {
			
			public void m1(){
				
				System.out.println("Inner class method");
			}
		}
		
		public static void main(String args[]) {
			
			Outer o = new Outer			  |	|
			Outer.Inner i = o.new Inner();| |== Outer.Inner i = o.new Outer().new Inner();
			i.m1();						  |== new Outer().new Inner().m1()							
		}
	}
	
			

  Case 2. Access inner class code from instance area of outer class.

		Ex. 
		
		class Outer {
			
			class Inner {
				
				public void m1(){
					
					System.out.println("Inner class method");
				}
			}
			public void m2 (){
				
				Inner  i = new Inner();
				i.m1();
			
			}
			
			public static void main(String args[]) {
				
				Outer o - new Outer();
				o.m2();
			
			}
		}
	
  Case 3. Accessing inner class code from outside of Outer class .
  
  
			class Outer {
				
				class Inner {
					
					public void m1(){
						
						System.out.println("Child class innner method");
					}
				}
			}
			
			class Test {
				
				public static void main(String args[]) {
					
					Outer o = new Outer();
					Outer.Inner i = o.new Inner();
					i.m1();
				}
			}


























 
	
	
	
	
    
	
	
    
	