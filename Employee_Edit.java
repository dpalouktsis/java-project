package TeamProject;

import java.util.List;

public class Employee_Edit extends Employee {

	public Employee_Edit(String name, String surname, String dob, String adress, int id, String phonenum,
			String status) {
		super(name, surname, dob, adress, id, phonenum, status);
		// TODO Auto-generated constructor stub
	}

	static void EditSearch(String crit1) {

		for (Employee Employees : Employees) {
			if (((List<Employee>) Employees).contains(crit1)) {
				System.out.println(Employees.name);
				System.out.println(Employees.surname);
				System.out.println(Employees.dob);
				System.out.println(Employees.id);
				System.out.println(Employees.adress);

			}

		}

	}

	static void EditFin(int id2) {
		for (Employee Employees : Employees) {
			if (Employees.id == id2) {
				// what do you want to edit? with 6 cases//
			}
		}
	}
}
