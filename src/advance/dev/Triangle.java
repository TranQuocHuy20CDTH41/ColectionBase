package advance.dev;

public class Triangle extends Shape {
	private double canhC, canhD, canhE;
	
	
	
	public Triangle(String name, double canhC, double canhD, double canhE) {
		super(name);
		this.canhC = canhC;
		this.canhD = canhD;
		this.canhE = canhE;
		// TODO Auto-generated constructor stub
	}

	@Override
	double chuVi() {
		// TODO Auto-generated method stub
		return canhE + canhD + canhC;
	}

	@Override
	double dienTich() {
		// TODO Auto-generated method stub
		double p = chuVi()/2;
		return Math.sqrt(p * (p - canhC) * (p - canhD) * (p - canhE) );
	}

	@Override
	public String toString() {
		return String.format("canh C, canh D, canh E, %s", canhC, canhD, canhE);
	}

}
