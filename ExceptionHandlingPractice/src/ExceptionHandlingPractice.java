
public class ExceptionHandlingPractice {

	public static void main(String[] args) 
	{
		//ClassCastException
		try
		{
			Animal a = new Animal();
			((Horse)a).bearYoung();
			System.out.println(a);
			
			
		}
		catch (ClassCastException exc)
		{
			System.out.println("Class Cast Exception. Try again.");
		}
		
		
		//NullPointerException
		try
		{
			String error = null;
			if(error.equals("works"))
			{
				System.out.println("works");
			}
			
		}
		catch (NullPointerException exc)
		{
			System.out.println("Null Pointer Exception found. Try again.");
		}
		
		
		//NumberFormatException
		try
		{
			String name = "Fred";
			int length = Integer.parseInt(name);
			System.out.println("int value of your string: " + length);
		}
		catch (NumberFormatException exc)
		{
			System.out.println("Number Format Exception found. Try again.");
		}

	}

}
