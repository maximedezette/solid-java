package ISP;

public class Dog implements Animal {

	@Override
	public void Run() {
	}

	@Override
	public void Bark() {
	}

	@Override
	public void Fly() {
		throw new IllegalStateException("dogs can't fly !");
	}

}
