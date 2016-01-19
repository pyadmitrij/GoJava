package module008.file;

public class Audio extends File {
	
	public Audio(String name, int size) {
		super(name, size);
	}

	@Override
	public void printInfo() {

		System.out.println(getName() + "." + getSize());
	}
}
