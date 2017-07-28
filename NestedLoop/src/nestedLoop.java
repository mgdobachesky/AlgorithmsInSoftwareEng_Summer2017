import java.util.concurrent.TimeUnit;

public class nestedLoop {
	public static int rowSize;
	public static int columnSize;
	
	public static void generateGrid() {
		boolean[][] bossGrid = new boolean[columnSize][rowSize];
		int col = (int)Math.floor((int)(Math.random() * columnSize));
		int row = (int)Math.floor((int)(Math.random() * rowSize));
		
		bossGrid[col][row] = true;
		//System.out.println(col + " : " + row); 
		//printGrid(bossGrid);
		findBoss(bossGrid);
	}
	
	public static void printGrid(boolean[][] bossGrid) {
		for(int i = 0; i < rowSize; i++) {
			for(int j = 0; j < columnSize; j++) {
				if(bossGrid[i][j] == false) {
					System.out.print(" O ");
				} else {
					System.out.print(" X ");
				}
			}
			System.out.println("");
		}
	}
	
	public static void findBoss(boolean[][] bossGrid) {
		System.out.println();
		for(int i = 0; i < rowSize; i++) {
			for(int j = 0; j < columnSize; j++) {
				if(bossGrid[i][j] == true) {
					System.out.println("Boss is in column " + ++i + " row " + ++j);
					return;
				}
			}
		}
	}
	
	private static void programLength() {
		long startTime = System.nanoTime();
		generateGrid();
		long endTime = System.nanoTime();
		
		long difference = endTime - startTime;
		
		long differenceInMicro = TimeUnit.MICROSECONDS.convert(difference, TimeUnit.NANOSECONDS);
		System.out.println();
		System.out.println("The program took this many microseconds: " + differenceInMicro);
	} 

	public static void main(String[] args) {
		rowSize = 8;
		columnSize = 8;
		programLength();
	}

}
