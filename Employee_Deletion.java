package TeamProject;

import java.util.Scanner;

public class Employee_Deletion extends Employee {

	public Employee_Deletion(String name, String surname, String dob, String adress, String phonenum, double salary,
			String position) {
		super(name, surname, dob, adress, phonenum, salary, position);
		// TODO Auto-generated constructor stub
	}

	Scanner sc = new Scanner(System.in);

	static void DeletionSearch(String crit) {

		for (Employee Employees : Employee.Employees.values()) {
			if ((Employees.name).contains(crit) || (Employees.surname).contains(crit) || (Employees.dob).contains(crit)
					|| (Employees.adress).contains(crit) || (Employees.phonenum).contains(crit)) {
				System.out.println(Employees.name);
				System.out.println(Employees.surname);
				System.out.println(Employees.dob);
				System.out.println(Employees.getId());
				System.out.println(Employees.adress);
				System.out.println(Employees.phonenum);
				System.out.println(Employees.salary);

			}

		}

	}

	static void DeletionFin(int id1) {
		Employees.remove(id1);
	}
}
