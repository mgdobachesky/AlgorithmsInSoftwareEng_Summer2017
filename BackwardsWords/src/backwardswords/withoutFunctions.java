package backwardswords;

import java.util.concurrent.TimeUnit;

public class withoutFunctions {

	public static void main(String[] args) {
		programLength();
	}
	
	private static void processString(String words) {
		String subword = "";
		for(int i = words.length(); i >= 0; i--) {
			if(i == 0 || Character.toString(words.charAt(i-1)).matches("[ ]")) {
				for(int k = subword.length(); k > 0; k--) {
					System.out.print(subword.charAt(k-1));
				}
				System.out.println();
				subword = "";
			} else {
				subword += words.charAt(i-1);
			}
			
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
