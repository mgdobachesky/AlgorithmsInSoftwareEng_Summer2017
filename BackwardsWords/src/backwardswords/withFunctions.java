package backwardswords;

import java.util.concurrent.TimeUnit;

public class withFunctions {

	public static void main(String[] args) {
		programLength();

	}
	
	private static void processString(String words) {
		String[] individualWords = words.split(" ");
		for(int i = individualWords.length; i > 0; i--) {
			System.out.println(individualWords[i-1]);
		}
	}
	
	private static void programLength() {
		long startTime = System.nanoTime();
		processString("This is a word");
		long endTime = System.nanoTime();
		
		long difference = endTime - startTime;
		
		long differenceInMicro = TimeUnit.MICROSECONDS.convert(difference, TimeUnit.NANOSECONDS);
		System.out.println();
		System.out.println("The program took this many microseconds: " + differenceInMicro);
	} 
}
