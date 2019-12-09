package TeamProject;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class MainERP {
	public static void ExInserts() {
		Employee E1 = new Employee("George", "Papadopoulos", "01/02/1980", "Oxford Street 4", "76372", 1000d, "wefef");
		Employee E2 = new Employee("John", "Lennon", "11/04/1960", "Weird Street 90", "52543", 20000d, "wefef");
		Employee E3 = new Employee("Alex", "Turner", "1/01/1988", "Weirder Street 14", "34242", 1500d, "wefef");
		Employee E4 = new Employee("James", "Hetfield", "21/02/1972", "Scary Street 47", "09772", 800d, "wefef");
		Employee E5 = new Employee("Sam", "Carter", "30/12/1990", "Spooky Street 5", "798782", 1900d, "wefef");

	}

	public static void main(String[] args) {
		ExInserts();

		int choice = -1;
		boolean b = false;
		while (!b) {
			if (choice == -1) {
				System.out.println("Welcome to our menu!");
				System.out.println("Here are your choices:");
				System.out.println("1.Add an employee");
				System.out.println("2.Erase an employee");
				System.out.println("3.Search and edit an employee");
				System.out.println("4.Search and edit an employee's salary");
				System.out.println("5.Log out/Exit system");
				Scanner sc1 = new Scanner(System.in);

				choice = sc1.nextInt();
			}
			switch (choice) {
			case 1:
				Scanner sc2 = new Scanner(System.in);
				System.out.println("Enter name");
				String name = sc2.nextLine();
				System.out.println("Enter surname");
				String surname = sc2.nextLine();
				System.out.println("Enter dob");
				String dob = sc2.nextLine();
				System.out.println("Enter adress");
				String adress = sc2.nextLine();
				System.out.println("Enter phonenum");
				String phonenum = sc2.nextLine();
				System.out.println("Enter position");
				String position =  sc2.nextLine();
				System.out.println("Enter salary");
				double salary = sc2.nextDouble();
				Employee e1 = new Employee(name, surname, dob, adress, phonenum, salary, position); // The id of the employee
				// is irrelevant//
				System.out.println("The Employee has been added to the system");
				System.out.println(e1.name + " " + e1.surname + " " + e1.getId() + " " + e1.salary);
				choice = -1;
				continue;
			case 2:
				Employee.getSearch();
				System.out.println("Select the id of the Employee you want to erase");
				Scanner sc3 = new Scanner(System.in);
				int id1 = sc3.nextInt();
				Employee.DeletionFin(id1);
				System.out.println("The Employee has been erased from the system");
				choice = -1;
				continue;
			case 3:
				System.out.println("By which criteria do you want to search?");
				Scanner sc5 = new Scanner(System.in);
				String crit4 = sc5.nextLine();
				Employee_Edit.EditSearch(crit4);
				System.out.println("Select the id of the Employee you want to edit");
				int id2 = sc5.nextInt();
				Employee_Edit.EditFin(id2);
				System.out.println("The Employee has been edited");
				choice = -1;
				continue;
			case 4:
				System.out.println("Which position salary do you want(lowsalary, mediumsalary, highsalary)?");// me
																												// name//
				Scanner scsal87 = new Scanner(System.in);
				String pos = scsal87.nextLine();
				Employee.SalEdit(pos);
				System.out.println("The Employeesal has been edited");
				choice = -1;
				continue;
			case 5:
				System.out.println("Thank you for using our menu");
				b = true;
				break;

			}
		}
	}
}