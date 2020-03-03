
public  class Animal 
{
	// use protected for inheritance, private everywhere else 
			protected String name;
			protected String food;
			
			//abstract methods:
			public  void bearYoung() 
			{
				System.out.println("Animals bear young.");
			}
			public  void makeNoise()
			{
				System.out.println("Animals make noise");
			}
			
			//concrete method:
			public void eat()
			{
				System.out.println("The " + name + " is looking forward to eating " + food + ".");
				
			}

}
