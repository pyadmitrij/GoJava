package flower;

public class Chamomile extends Flower {
	
	private String name = "Chamomile";

	public String getName() {
		return name;
	}

	public Chamomile(String color) {
		super(color);
	}

	@Override
	public void printInfo() {
		System.out.println(getName() + ", color " + getColor());	
	}
	
}