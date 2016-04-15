package solid.OCP;

public class Rectangle implements Shape {
	
	private double height;
	private double width;

	public Rectangle(double height, double width) {
		this.height = height;
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public double getWidth() {
		return width;
	}

	@Override
	public double area() {
		return getHeight() * getWidth();
	}
}
