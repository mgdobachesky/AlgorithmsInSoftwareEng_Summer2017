package Final;

public class FinalPart1 {
	
	public static String sortByNumbersInWords(String stringToSort) {
		// Initialize variables
		String[] words = stringToSort.split(" ");
		String[] sortedWords = new String[words.length];
		StringBuffer concatSortedWords = new StringBuffer();
		
		// Sort the words by which number is in each word
		for(int i = 0; i < words.length; i++) {
			for(char letter : words[i].toCharArray()) {
				if(Character.isDigit(letter)) {
					sortedWords[Integer.parseInt(String.valueOf(letter))-1] = words[i];
				}
			}
		}
		
		// Concatenate the sorted strings to be one long string
		for(int i = 0; i < sortedWords.length; i++) {
			concatSortedWords.append(sortedWords[i]);
			concatSortedWords.append(" ");
		}
		
		// Return the sorted word phrase
		return concatSortedWords.toString();
	}

	public static void main(String[] args) {
		System.out.println(sortByNumbersInWords("is2 Thi1s T4est 3a"));
	}

}
