package solid.OCP;

public class Circle implements Shape {
	private float radius;

	public Circle(float radius) {
		this.radius = radius;
	}

	@Override
	public double area() {
		return this.radius * this.radius * Math.PI;
	}

}
