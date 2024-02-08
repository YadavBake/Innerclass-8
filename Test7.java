interface Outer 
		{
			public void m1();
			
				interface Inner 
				{
					public void m2();
					
	            }
		}
                     
		class Test5 implements Outer
		{
			
			public void m1()
			{
				System.out.println("Outer interface method implementations");
			}
		}
		
		class Test6 implements Outer.Inner
		{
			
			public void m2()
			{
				System.out.println("Inner interface method implementations");
			}
		}
                                                
                                                
		class Test7 
		{
			public static void main(String args[])
			{
				Test5 t1 = new Test5();
				t1.m1();
				Test6 t2 = new Test6();
				t2.m2();
			}
		}