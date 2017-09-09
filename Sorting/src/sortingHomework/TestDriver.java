package sortingHomework;

import sortingHomework.Employee.CompareType;

public class TestDriver {

	static final int NUMBER_OF_EMPLOYEES = 10;
	
	public static void main(String[] args) {
		Employee[] employees = new Employee[NUMBER_OF_EMPLOYEES];
		employees[0] = new Employee("Leia", 20);
		employees[1] = new Employee("Shayla", 35);
		employees[2] = new Employee("Reinaldo", 23);
		employees[3] = new Employee("Florentino", 29);
		employees[4] = new Employee("Dennis", 22);
		employees[5] = new Employee("Lorine", 32);
		employees[6] = new Employee("Kala", 26);
		employees[7] = new Employee("Geoffrey", 43);
		employees[8] = new Employee("Ema", 46);
		employees[9] = new Employee("Johnathon", 39);
		
		System.out.println("~~ Sort By Name ~~");
		Employee.compare = CompareType.NAME;
		employees = (Employee[])BubbleSort.sort(employees);
		printEmployees(employees);
		
		System.out.println("\n~~ Sort By Age ~~");
		Employee.compare = CompareType.AGE;
		employees = (Employee[])BubbleSort.sort(employees);
		printEmployees(employees);
	}
	
	private static void printEmployees(Employee[] employees) {
		for(int i = 0; i < employees.length; i++) {
			System.out.println(employees[i].toString());
		}
	}

}
