package OCP;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class AreaCalculatorBehavior {

	AreaCalculator calculator = new AreaCalculator();

	@Test
	public void shouldCalculateARectangleArea() {
		
		List<Rectangle> rectangles = new ArrayList<Rectangle>();
		rectangles.add(new Rectangle(10, 3));
		
		double area = calculator.area(rectangles);
		
		assertEquals(30.0, area, 0.01);
	}

	@Test
	public void shouldCalculateTotalAreaForTwoRectangles() {
		
		List<Rectangle> rectangles = new ArrayList<Rectangle>();
		rectangles.add(new Rectangle(10, 3));
		rectangles.add(new Rectangle(4, 5));
		
		double area = calculator.area(rectangles);
		
		assertEquals(50.0, area, 0.01);
	}
	
//	@Test
//	public void shouldCalculateACircleArea() {
//		List<Circle> circles = new ArrayList<Circle>();
//		circles.add(new Circle(5));
//		
//		double area = calculator.area(circles);
//		
//		assertEquals(78.5, area, 0.1);
//	}
}
