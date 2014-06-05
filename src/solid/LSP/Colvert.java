package solid.LSP;

public class Colvert implements Duck {

	private boolean hasMoved;

	@Override
	public boolean hasMoved() {
		return this.hasMoved;
	}

	@Override
	public void swim() {
		this.hasMoved = true;
	}

}
