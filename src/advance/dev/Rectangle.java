package advance.dev;

public class Rectangle extends Shape {
	private double canhA, canhB;

	
	
	public Rectangle(String name, double canhA, double canhB) {
		super(name);
		this.canhA = canhA;
		this.canhB = canhB;
		// TODO Auto-generated constructor stub
	}

	@Override
	double chuVi() {
		// TODO Auto-generated method stub
		return (canhA + canhB) * 2;
	}

	@Override
	double dienTich() {
		// TODO Auto-generated method stub
		return canhA * canhB;
	}

	@Override
	public String toString() {
		return String.format("canh A, canh B, %s", canhA, canhB);
	}

}
