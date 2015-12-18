package flower;

public class Tulip extends Flower {
	
	private String name = "Tulip";
	
	public String getName() {
		return name;
	}

	public Tulip(String color) {
		super(color);
	}

	@Override
	protected void printInfo() {
		System.out.println(getName() + ", color " + getColor());		
	}

}
