package exercise6_1;

public class RecursiveFunction {
	public static void main(String[] args) {
		double y = power(5.6, 3594); 
		System.out.println( y );
	}
	
	static double power(double x, int n) {
		if(n == 0) {
			System.out.println(x + " * (" + x + " ^ " + n + ")");
			return 1.0;
			
		}
		System.out.println(x + " * (5.6 ^ " + n + ")");
		return x * power(x, n-1);
	}
}

// Max power is 3594

