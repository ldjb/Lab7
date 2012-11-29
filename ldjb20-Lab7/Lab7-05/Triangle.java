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
		lenSide1 = var1;
		lenSide2 = var2;
		lenSide3 = var3;
	}
	
	public void setLenSide1(float var) {
		lenSide1 = var;
	}
	
	public float getLenSide1() {
		return lenSide1;
	}
	
	public void setLenSide2(float var) {
		lenSide2 = var;
	}
	
	public float getLenSide2() {
		return lenSide2;
	}
	
	public void setLenSide3(float var) {
		lenSide3 = var;
	}
	
	public float getLenSide3() {
		return lenSide3;
	}

}