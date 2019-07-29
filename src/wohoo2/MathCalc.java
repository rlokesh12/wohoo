package wohoo2;

public class MathCalc {
	
	public MathCalc() {
		
	}
	
	public int add(int x, int y) {
		return x+y;
	}
	
	public int subtract(int x, int y) {
		return x-y;
	}
	
	public int multiply(int x, int y) {
		return x*y;
	}
	
	public double divide(int x, int y) {
		double xd = x;
		double yd = y;
		double result = 0;
		//try {
			result = xd/yd;
		//} catch (ArithmeticException e) {
		//	System.out.println("y is zero");
		//}
		return result;
	}
	
	public static void main(String[] args) {
		MathCalc mathCalc = new MathCalc();
		int a,s,m;
		double d;
		int x,y;
		x = 10;
		y = 0;
		a = mathCalc.add(x, y);
		s = mathCalc.subtract(x, y);
		m = mathCalc.multiply(x, y);
		d = mathCalc.divide(x, y);
		System.out.println(a+" "+s+" "+m+" "+d);
	}
	
}
