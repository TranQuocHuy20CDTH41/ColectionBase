package advance.dev;

public class Circle extends Shape {
	private double banKinh;

	
	
	public Circle(String name, double banKinh) {
		super(name);
		this.banKinh = banKinh;
		// TODO Auto-generated constructor stub
	}

	@Override
	double chuVi() {
		// TODO Auto-generated method stub
		return 2 * banKinh * Math.PI;
	}

	@Override
	double dienTich() {
		// TODO Auto-generated method stub
		return Math.PI * banKinh * banKinh;
	}

	@Override
	public String toString() {
		return String.format("ban kinh, %s", banKinh);
	}

}
