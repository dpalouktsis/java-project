package TeamProject;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Employee_Edit extends Employee {

	public Employee_Edit(String name, String surname, String dob, String adress, int id, String phonenum,
			String status) {
		super(name, surname, dob, adress, id, phonenum, status);
		// TODO Auto-generated constructor stub
	}

	@SuppressWarnings({ "unchecked", "unlikely-arg-type" })
	static void EditSearch(String crit1) {

		for (Employee Employees : Employees) {
			if (((Employees.name).contains(crit1) || (Employees.surname).contains(crit1) || (Employees.dob).contains(crit1) ||
					(Employees.adress).contains(crit1) || (Employees.phonenum).contains(crit1)
					|| (Employees.status).contains(crit1)) ) {
				System.out.println(Employees.name);
				System.out.println(Employees.surname);
				System.out.println(Employees.dob);
				System.out.println(Employees.id);
				System.out.println(Employees.adress);
				System.out.println(Employees.status);

			}

		}

	}

	static void EditFin(int id2) {
		for (Employee Employees : Employees) {
			if (Employees.id == id2) {
				Scanner sc3 = new Scanner(System.in);
				int a = sc3.nextInt();// what do you want to edit? with 6 cases//
				switch (a) {
				case 1:
					System.out.println("Insert the new name");
					Scanner sc4 = new Scanner(System.in);
					Employees.name = sc4.nextLine();
					break;
				}
			}
		}
	}
}
