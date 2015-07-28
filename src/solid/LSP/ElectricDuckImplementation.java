package solid.LSP;

public class ElectricDuckImplementation implements ElectricDuck {

	private boolean isTurnedOn = false;
	private boolean hasMoved = false;
	
	/* (non-Javadoc)
	 * @see solid.LSP.ElectricDuck#swim()
	 */
	@Override
	public void swim() {
		if (!this.isTurnedOn) {
			throw new CannotSwimException();
		}
		
		this.hasMoved = true;
	}
	
	/* (non-Javadoc)
	 * @see solid.LSP.ElectricDuck#turnOn()
	 */
	@Override
	public void turnOn() {
		this.isTurnedOn = true;
	}

	/* (non-Javadoc)
	 * @see solid.LSP.ElectricDuck#hasMoved()
	 */
	@Override
	public boolean hasMoved() {
		return this.hasMoved;
	}

}
