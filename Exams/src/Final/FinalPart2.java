package Final;

public class FinalPart2 {

	public static String[][] records = {
			{"Gary Smith", "GarySmith@neit.edu", "$15.00"},
			{"Laila Kerniech", "LailaKerniech@neit.edu", "$30.00"},
			{"Shawn Kemp", "ShawnKemp@neit.edu", "$23.50"},
			{"Sarah Palin", "SarahPalin@neit.edu", "$110.00"},
			{"Ray Connif", "RayConnif@neit.edu", "$0.00"},
			{"Edmund Cortis", "EdmundCortis@neit.edu", "$50.00"},
			{"John Matis", "JohnMatis@neit.edu", "$15.00"}
	};
	public static String[][] hashedRecords = new String[20][3];
	
	public static int hashRoutine(String key) {
		int len = key.length();
		int sum = 0;
		for(int i = 0; i < len; i++) {
			int decVal = key.charAt(i);
			sum = sum + decVal;
		}
		sum = sum % 20;
		return sum;
	}
	
	public static void hash(String key) {
		displayRecord(hashRoutine(key));
	}
	
	public static void displayRecord(int i) {
		System.out.println("Record: " + hashedRecords[i][0] + " - " + hashedRecords[i][1] + " - " + hashedRecords[i][2]);
	}
	
	public static void main(String[] args) {
		for(int i = 0; i < records.length; i++) {
			int hashIndex = hashRoutine(records[i][0]);
			
			hashedRecords[hashIndex][0] = records[i][0];
			hashedRecords[hashIndex][1] = records[i][1];
			hashedRecords[hashIndex][2] = records[i][2];
		}
		
		hash("Shawn Kemp");
		hash("Ray Connif");
		hash("John Matis");
		hash("Edmund Cortis");
		hash("Laila Kerniech");
		hash("Gary Smith");
		hash("Sarah Palin");
	}

}
