public class Triangle {

	private float lenSide1;
	private float lenSide2;
	private float lenSide3;

	public Triangle() {
		lenSide1 = 1;
		lenSide2 = 1;
		lenSide3 = 1;
	}
	
	public Triangle(float var1, float var2, float var3) {
		this();
		if (var1 > 0 && var2 > 0 && var3 > 0) {
			lenSide1 = var1;
			lenSide2 = var2;
			lenSide3 = var3;
		}
		else {
			System.err.println("Error: Non-positive lenSide given.");
		}
	}
	
	public void setLenSide1(float var) {
		if (var > 0) {
			lenSide1 = var;
		}
		else {
			System.err.println("Error: Non-positive lenSide1 given.");
		}
	}
	
	public float getLenSide1() {
		return lenSide1;
	}
	
	public void setLenSide2(float var) {
		if (var > 0) {
			lenSide2 = var;
		}
		else {
			System.err.println("Error: Non-positive lenSide2 given.");
		}
	}
	
	public float getLenSide2() {
		return lenSide2;
	}
	
	public void setLenSide3(float var) {
		if (var > 0) {
			lenSide3 = var;
		}
		else {
			System.err.println("Error: Non-positive lenSide3 given.");
		}
	}
	
	public float getLenSide3() {
		return lenSide3;
	}
	
	public float area() {
		// Use Heron's formula to calculate area
		float s = (lenSide1 + lenSide2 + lenSide3) / 2;
		float T = (float)Math.sqrt((double)(s * (s - lenSide1) * (s - lenSide2) * (s - lenSide3)));
		return T;
	}
	
	public float perimeter() {
		// Calculate perimeter
		return lenSide1 + lenSide2 + lenSide3;
	}

}