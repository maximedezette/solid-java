package OCP;

import java.util.List;

public class AreaCalculator {

	public double area(List<Rectangle> rectangles) {
		double area = 0;
		
		for (Rectangle rectangle : rectangles) {
			area += rectangle.getHeight() * rectangle.getWidth();
		}
		
		return area;
	}

}
