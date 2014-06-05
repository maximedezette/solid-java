package solid.OCP;

import java.util.List;

public class AreaCalculator {

	public float area(List<Rectangle> rectangles) {
		float area = 0;
		
		for (Rectangle rectangle : rectangles) {
			area += rectangle.getHeight() * rectangle.getWidth();
		}
		
		return area;
	}

}
