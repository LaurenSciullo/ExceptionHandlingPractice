
public class Horse extends Animal
{

	public Horse()
	{
		name = "Horse";
	}
	@Override
	public void bearYoung() {
		System.out.println(" colts and fillys. ");
		
	}

	@Override
	public void makeNoise() {
		System.out.println(" neigh.");
		
	}
	
	public static void horseActivity()
	{
		System.out.println("Horses can jump");
	}

}
