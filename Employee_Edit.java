package TeamProject;

import java.util.Scanner;

public class Employee_Edit extends Employee {

	public Employee_Edit(String name, String surname, String dob, String adress, int id, int phonenum, double salary,
			String position) {
		super(name, surname, dob, adress, phonenum, salary, position);
		// TODO Auto-generated constructor stub
	}

	static void EditSearch(String crit1) {

		for (Employee Employees : Employee.Employees.values()) {
			if (((Employees.name).contains(crit1) || (Employees.surname).contains(crit1)
					|| (Employees.dob).contains(crit1) || (Employees.adress).contains(crit1))) {
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

	static void EditFin(int id2) {
		for (Employee Employees : Employee.Employees.values()) {
			if (Employees.getId() == id2) {
				Scanner sc3 = new Scanner(System.in);
				System.out.println("1.Edit name");
				System.out.println("2.Edit surname");
				System.out.println("3.Edit dob");
				System.out.println("4.Edit adress");
				System.out.println("5.Edit phonenum");
				System.out.println("6.Edit salary");
				int a = sc3.nextInt();// what do you want to edit? with 6 cases//
				switch (a) {
				case 1:
					System.out.println("Insert the new name");
					Scanner sc4 = new Scanner(System.in);
					Employees.name = sc4.nextLine();
					break;
				case 2:
					System.out.println("Insert the new surname");
					Scanner sc5 = new Scanner(System.in);
					Employees.surname = sc5.nextLine();
					break;
				case 3:
					System.out.println("Insert the new dob");
					Scanner sc6 = new Scanner(System.in);
					Employees.dob = sc6.nextLine();
					break;
				case 4:
					System.out.println("Insert the new adress");
					Scanner sc7 = new Scanner(System.in);
					Employees.adress = sc7.nextLine();
					break;
				case 5:
					System.out.println("Insert the new phonenum");
					Scanner sc8 = new Scanner(System.in);
					Employees.phonenum = sc8.nextInt();
					break;
				case 6:
					System.out.println("Insert the new salary");
					Scanner sc9 = new Scanner(System.in);
					Employees.salary = sc9.nextDouble();
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
							Employees.salary = sc9.nextDouble();
						}
					}
					break;
				}
			}
		}
	}
}
