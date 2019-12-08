package TeamProject;

import java.util.Scanner;

public class Employee_Edit extends Employee {

	public Employee_Edit(String name, String surname, String dob, String adress, int id, String phonenum) {
		super(name, surname, dob, adress, phonenum);
		// TODO Auto-generated constructor stub
	}

	static void EditSearch(String crit1) {

		for (Employee Employees : Employees) {
			if (((Employees.name).contains(crit1) || (Employees.surname).contains(crit1)
					|| (Employees.dob).contains(crit1) || (Employees.adress).contains(crit1)
					|| (Employees.phonenum).contains(crit1))) {
				System.out.println(Employees.name);
				System.out.println(Employees.surname);
				System.out.println(Employees.dob);
				System.out.println(Employees.getId());
				System.out.println(Employees.adress);

			}

		}

	}

	static void EditFin(int id2) {
		for (Employee Employees : Employees) {
			if (Employees.getId() == id2) {
				Scanner sc3 = new Scanner(System.in);
				System.out.println("1.Edit name");
				System.out.println("2.Edit surname");
				System.out.println("3.Edit dob");
				System.out.println("4.Edit adress");
				System.out.println("5.Edit phonenum");
				int a = sc3.nextInt();// what do you want to edit? with 5 cases//
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
					Employees.phonenum = sc8.nextLine();
					break;
				}
			}
		}
	}
}
