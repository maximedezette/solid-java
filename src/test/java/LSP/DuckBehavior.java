package LSP;

import static org.junit.Assert.*;

import org.junit.Test;

public class DuckBehavior {

	@Test
	public void colvertShouldSwim() {
		Duck duck = new Colvert();
		
		duck.swim();
		
		assertTrue(duck.hasMoved());
	}

	@Test
	public void electricDuckShouldSwim() {
		Duck duck = new ElectricDuck();
		
		// pour faire fonctionner un canard électrique
		// duck.TurnOn();
		duck.swim();
		
		assertTrue(duck.hasMoved());
	}
}
