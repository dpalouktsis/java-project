package TeamProject;

import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.atomic.AtomicInteger;

public class Employee {
	public String name;
	public String surname;
	public String dob;// date of birth//
	public String adress;
	public int id;
	public String phonenum;
	public String status;
	private static final AtomicInteger count = new AtomicInteger(0);
	static ArrayList<Employee> Employees = new ArrayList<Employee>();

	public Employee(String name, String surname, String dob, String adress, int id, String phonenum, String status) {

		this.name = name;
		this.surname = surname;
		this.dob = dob;
		this.adress = adress;
		this.id = id;
		this.phonenum = phonenum;
		id = count.incrementAndGet();
		Employees.add(this);
	}

	public void ExInserts() { // we are inserting the same id for everybody cause it automatically changes//
		Employee E1 = new Employee("George", "Papadopoulos", "01/02/1980", "Oxford Street 4", 0, "76372", "single");
		Employee E2 = new Employee("John", "Lennon", "11/04/1960", "Weird Street 90", 0, "52543", "married");
		Employee E3 = new Employee("Alex", "Turner", "1/01/1988", "Weirded Street 14", 0, "34242", "single");
		Employee E4 = new Employee("James", "Hetfield", "21/02/1972", "Scary Street 47", 0, "09772", "married");
		Employee E5 = new Employee("Sam", "Carter", "30/12/1990", "Spooky Street 5", 0, "798782", "single");

	}

	public static void main(String[] args) {
		System.out.println("Welcome to our menu!");
		System.out.println("Here are your choices:");
		System.out.println("1.Add an employee");
		System.out.println("2.Erase an employee");
		System.out.println("3.Search and edit an employee");
	}

}
