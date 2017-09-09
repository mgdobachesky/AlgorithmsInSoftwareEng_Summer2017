package exercises;
import java.util.Random;

public class Bubble {
	static int[] data = new int[1000000];
	
	public int[] sort(int[] data) {
		int len = data.length;
		
		long start, stop, elapsed;
		start = System.currentTimeMillis();
		
		for(int pass=1; pass<len; pass++) {
			//System.out.println("Pass = " + pass);
			for(int compares=0; compares<len-pass; compares++) {
				//System.out.println(compares);
				if(data[compares] < data[compares+1]) {
					int temp = data[compares];
					data[compares] = data[compares+1];
					data[compares+1] = temp;
				}
			}
		}
		
		stop = System.currentTimeMillis();
		elapsed = stop - start;
		System.out.println("Elapse: " + elapsed);
		
		return data;
	}
	
	
	public void printData() {
		for(int i=0; i<data.length; i++) {
			//System.out.println(data[i]);
		}
	}
	
	public static void main(String[] args) {
		Random rand = new Random();
		for(int i = 0; i < data.length; i++) {
			data[i] = rand.nextInt();
		}
		
		System.out.println("The unsorted order: ");
		Bubble bubble = new Bubble();
		bubble.printData();
		
		bubble.sort(bubble.data);
		
		System.out.println("The sorted order: ");
		bubble.printData();
	}

}
