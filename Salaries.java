package TeamProject;

import java.util.Scanner;

public class Salaries extends Employee {

	public Salaries(String name, String surname, String dob, String adress, String phonenum, double salary,
			String position) {
		super(name, surname, dob, adress, phonenum, salary, position);
		// TODO Auto-generated constructor stub
	}

	public static void SalSearch(String position1) {
		for (Employee Employees : Employee.Employees.values()) {

			if ((Employees.position).contains(position1)) {
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

	public static void SalEdit(double sal, int id3) {
		for (Employee Employees : Employee.Employees.values()) {
			if (id3 == Employees.getId()) {
				Employees.salary = sal;
			}
			boolean b = true;
			while (b) {
				if (Employees.salary > 758 && Employees.salary <= 1100) {
					Employees.position = "lowsalary";
					b = false;
				} else if (Employees.salary > 1100 && Employees.salary <= 1900) {
					Employees.position = "mediumsalary";
					b = false;
				} else if (Employees.salary > 1900) {
					Employees.position = "highsalary";
					b = false;
				} else {
					System.out.println("The salary is too low");
					Scanner scsal = new Scanner(System.in);
					Employees.salary = scsal.nextDouble();
				}

			}
		}
	}

}
