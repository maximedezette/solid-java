package ISP;

public class Bird implements Animal {

	@Override
	public void Fly() {
	}

	@Override
	public void Run() {
	}

	@Override
	public void Bark() {
		throw new IllegalStateException("birds can't bark !");
	}

}
