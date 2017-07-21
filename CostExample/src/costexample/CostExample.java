package costexample;

import java.util.concurrent.TimeUnit;

public class CostExample {

	public static void main(String[] args) {
		int count = 1000;
		long thousand = loop(count);
		
		count = 200_000_000;
		long million = loop(count);
		
		System.out.println("Large input takes " + (million - thousand) + " microseconds longer than small input");
	}
	
	private static long loop(int count) {
		long startTime = System.nanoTime();
		for(int index = 0; index < count; index++) {
			// do nothing
		}
		long endTime = System.nanoTime();
		
		long difference = endTime - startTime;
		
		long differenceInMicro = TimeUnit.MICROSECONDS.convert(difference, TimeUnit.NANOSECONDS);
		System.out.println("Difference in microseconds: " + differenceInMicro);
		
		return differenceInMicro;
	} 

}
