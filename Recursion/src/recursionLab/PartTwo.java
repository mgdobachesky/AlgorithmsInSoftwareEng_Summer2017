package recursionLab;

import java.util.ArrayList;
import java.util.List;

public class PartTwo {

	public static void main(String[] args) {
		for(String grouping : conwaySequence("1", 10)) {
			System.out.println(grouping);
		}
	}
	
	public static List<String> conwaySequence(String sequence, int iterations) {
		
		List<String> conwayList = new ArrayList<>();
		int sequenceLength = sequence.length();
		StringBuffer nextSequence = new StringBuffer();
		
		for(int i = 0; i < sequenceLength; i++) {
			char current = sequence.charAt(i);
			int currentInARow = 1;
			for(; i < sequenceLength-1 && current == sequence.charAt(i+1); currentInARow++, i++);
			nextSequence.append(Integer.toString(currentInARow));
			nextSequence.append(Character.toString(current));
		}
		
		conwayList.add(nextSequence.toString());
		if(iterations != 1) conwayList.addAll(conwaySequence(nextSequence.toString(), iterations-1));
		return conwayList;
	}

}