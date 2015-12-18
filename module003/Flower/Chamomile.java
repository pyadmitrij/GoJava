package Flower;

public class Chamomile extends Flower {
	
	private String name = "Chamomile";

	public String getName() {
		return name;
	}

	public Chamomile(Colors color) {
		super(color);
	}

	@Override
	public void printInfo() {
		System.out.println(getName() + ", color " + getColor());	
	}
	
}
