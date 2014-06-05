package solid.LSP;

public class ElectricDuckImplementation implements Duck {

	private boolean isTurnedOn = false;
	private boolean hasMoved = false;
	
	@Override
	public void swim() {
		if (!this.isTurnedOn) {
			throw new CannotSwimException();
		}
		
		this.hasMoved = true;
	}
	
	public void turnOn() {
		this.isTurnedOn = true;
	}

	@Override
	public boolean hasMoved() {
		return this.hasMoved;
	}

}
