
public class FibonacciSeries {
	
	public int[] fibonacciSeries(int N) {
		int[] series = new int[N];
		// initialize series[0] once = O(1)
		series[0] = 0;
		// initialize series[1] once = O(2)
 		series[1] = 1;
		
 		// initialize i once = O(3)
 		// increment i N-2 times = O(3 + 1(N-2))
		for(int i=2; i<N; i++) {
			// set series[i] N-2 times = O(3 + 2(N-2))
			series[i] = series[i-1] + series[i-2];
		}
		
		// computational complexity of this algorithm:
		// O(3 + 2(N-2))
		return series;
	}
	
	public void printFibonacciSeries(int[] series) {
		// initialize N once = O(1)
		int N = series.length;
		// initialize i once = O(2)
		// increment i N times = O(2 + 1(N))
		for(int i=0; i<N; i++) {
			// print series[i] N times = O(2 + 2(N))
			System.out.print(series[i] + " ");
		}
		
		// computational complexity of this algorithm:
		// O(2 + 2(N))
		
	}

	public static void main(String[] args) {
		// Fibonacci Series has a linear asymptotic complexity = O(N)
		FibonacciSeries fibonacci = new FibonacciSeries();
		
		// computational complexity of fibonacciSeries() = O(3 + 2(N-2))
		int[] fibonacciSeries = fibonacci.fibonacciSeries(15);
		
		// computational complexity of printFibonacciSeries() = O(2 + 2(N))
		fibonacci.printFibonacciSeries(fibonacciSeries);
		
		/*
		 * computational complexity of fibonacciSeries() = O(3 + 2(N-2))
		 * computational complexity of printFibonacciSeries() = O(2 + 2(N))
		 * -----------------------------------------------------------------
		 * total computational complexity = O(5 + 2(N) + 2(N-2))
		 *
		 * asymptotic complexity of O(5 + 2(N) + 2(N-2)):
		 * O(5 + 2(N) + 2(N-2))
		 * O(2(N) + 2(N-2))
		 * O(2(N-2))
		 * O(2(N))
		 * O(N)
		 *
		 * asymptotic complexity is linear = O(N)
		 */
		
	}

}
