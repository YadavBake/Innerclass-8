/*class Test 
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
				Inner i = new Inner();
				i.sum(10,20); 
				;;;;;;
				i.sum(100,200);
				;;;;;;
				i.sum(1000,2000);
			}
			public static void main(String args[])
			{
				
				Test t = new Test();
				t.m1();
			}
		}*/
		class Test 
		{	
		
		public void m1() 
		{
			
			final int x = 10;
			
			class Inner 
			{
				
				public void m2()
				{
					System.out.println(x);
				}
			}
			Inner i = new Inner();
			i.m2();
		}
		public static void main(String args[]) {
			
			Test t = new Test();
			t.m1();
		}
	}
				