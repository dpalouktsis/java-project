package TeamProject;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Employee_Deletion extends Employee {

	public Employee_Deletion(String name, String surname, String dob, String adress, int id, String phonenum,
			String status) {
		super(name, surname, dob, adress, id, phonenum, status);
	}

	Scanner sc = new Scanner(System.in);

	@SuppressWarnings("unchecked")
	static void DeletionSearch(String crit) {

		for (Employee Employees : Employees) {
			if ((Employees.name).contains(crit) || (Employees.surname).contains(crit) || (Employees.dob).contains(crit) ||
				(Employees.adress).contains(crit) || (Employees.phonenum).contains(crit)
				|| (Employees.status).contains(crit)) {
				System.out.println(Employees.name);
				System.out.println(Employees.surname);
				System.out.println(Employees.dob);
				System.out.println(Employees.id);

			}

		}

	}

	static void DeletionFin(int id1) {
		Employees.remove(id1);
	}
}
