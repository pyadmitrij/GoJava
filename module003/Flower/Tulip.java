package Flower;

public class Tulip extends Flower {
	
	private String name = "Tulip";
	
	public String getName() {
		return name;
	}

	public Tulip(Colors color) {
		super(color);
	}

	@Override
	public void printInfo() {
		System.out.println(getName() + ", color " + getColor());		
	}

}
