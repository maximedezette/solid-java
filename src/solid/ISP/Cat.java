package solid.ISP;

public class Cat implements Animal {

	@Override
	public void Run() {
	}

	@Override
	public void Fly() {
		throw new IllegalStateException("cats can't fly !");
	}

	@Override
	public void Bark() {
		throw new IllegalStateException("cats can't bark !");
	}

}
