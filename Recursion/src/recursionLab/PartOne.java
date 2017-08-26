package recursionLab;

public class PartOne {

	public static void main(String[] args) {
		System.out.println(reverse("Hello World!"));
		System.out.println(reverse("another string to test reverse"));
	}
	
	public static String reverse(String input) {
		int length = input.length();
		if(length == 1) {
			return input;
		}
		
		return Character.toString(input.charAt(length-1)).concat(reverse(input.substring(0, length-1)));
	}

}