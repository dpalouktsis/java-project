package TeamProject;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class MainERP {
	public static void ExInserts() { // we are inserting the same id for everybody cause it automatically changes//
		Employee E1 = new Employee("George", "Papadopoulos", "01/02/1980", "Oxford Street 4", 0, "76372", "single");
		Employee E2 = new Employee("John", "Lennon", "11/04/1960", "Weird Street 90", 0, "52543", "married");
		Employee E3 = new Employee("Alex", "Turner", "1/01/1988", "Weirded Street 14", 0, "34242", "single");
		Employee E4 = new Employee("James", "Hetfield", "21/02/1972", "Scary Street 47", 0, "09772", "married");
		Employee E5 = new Employee("Sam", "Carter", "30/12/1990", "Spooky Street 5", 0, "798782", "single");

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
				System.out.println("4.Log out/Exit system");
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
				System.out.println("Enter status(working experience)");
				String status = sc2.nextLine();
				System.out.println("Insert an integer to create id");
				int id = sc2.nextInt();
				Employee e1 = new Employee(name, surname, dob, adress, id, phonenum, status); // The id of the employee
																								// is irrelevant//
				System.out.println("The Employee has been added to the system");
				choice = -1;
				continue;
			case 2:
				System.out.println("By which criteria do you want to search?");
				Scanner sc3 = new Scanner(System.in);
				String crit = sc3.nextLine();
				Employee_Deletion.DeletionSearch(crit);
				System.out.println("Select the id of the Employee you want to erase");
				int id1 = sc3.nextInt();
				Employee_Deletion.DeletionFin(id1);
				System.out.println("The Employee has been erased from the system");
				choice = -1;
			case 3:
				System.out.println("By which criteria do you want to search?");
				Scanner sc5 = new Scanner(System.in);
				String crit4 = sc5.nextLine();
				Employee_Edit.EditSearch(crit4);
				System.out.println("Select the id of the Employee you want to edit");
				int id2 = sc5.nextInt();
				Employee_Edit.EditFin(id2);
				System.out.println("The Employee has been edited");
				break;

			}
		}
	}
}