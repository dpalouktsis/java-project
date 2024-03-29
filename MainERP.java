package TeamProject;

import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.InputMismatchException;

public class MainERP {
	public static void ExInserts() {
		Employee E1 = new Employee_Addition("George", "Papadopoulos", "01/02/1980", "Oxford Street 4", 6756, 1000d,
				"wefef");
		Employee E2 = new Employee_Addition("John", "Lennon", "11/04/1960", "Weird Street 90", 5656, 20000d, "wefef");
		Employee E3 = new Employee_Addition("Alex", "Turner", "1/01/1988", "Weirder Street 14", 1233, 1500d, "wefef");
		Employee E4 = new Employee_Addition("James", "Hetfield", "21/02/1972", "Scary Street 47", 2109, 800d, "wefef");
		Employee E5 = new Employee_Addition("Sam", "Carter", "30/12/1990", "Spooky Street 5", 12342152, 1900d, "wefef");

	}

	public static void main(String[] args) throws FileNotFoundException {
		ExInserts();

		EvalAddDynamic.addEvals("eval2.txt");
		EvalAddDynamic.addEvals("eval1.txt");

		Set<String> skills = new HashSet<String>();
		Set<String> skills1 = new HashSet<String>();

		skills.add("SkillB");
		skills1.add("SkillC");
		skills1.add("SkillA");

		TrainingProgram trp2 = new TrainingProgram(2, skills1, "bla");
		TrainingProgram trp1 = new TrainingProgram(1, skills, "bla");

		//TrpMethods.updateEmpTrp(0);// pairnei ta evaluations kai kanei assign ta training programms eite gia olous
									// eite gia sugkekrimeno//
		//System.out.println(Employee.Employees.get(3).reqTraining); // analoga me ta skills pou den einai kalos bgazei
																	// programmata pou xreaizetai//
		int choice = -1;
		boolean b = false;
		while (!b) {
			if (choice == -1) {
				System.out.println("Welcome to our menu!");
				System.out.println("Here are your choices:");
				System.out.println("1.Add an employee");
				System.out.println("2.Erase an employee");
				System.out.println("3.Search and edit an employee");
				System.out.println("4.Search based on salary levels");
				System.out.println("5.Add an Evaluation");
				System.out.println("6.Add an Evaluation dynamically");
				System.out.println("7.View all Training Programs");
				System.out.println("8.Search for Employee training based on id");
				System.out.println("9.Assign suitable training programs(use id or -1 for everyone)");
				System.out.println("10.Log out");

				Scanner sc1 = new Scanner(System.in);

				choice = sc1.nextInt();
			}
			switch (choice) {
			case 1:
				Scanner sc2 = new Scanner(System.in);
				System.out.println("Enter name");
				String name = sc2.nextLine();
				System.out.println("-----------------------");
				System.out.println("Enter surname");
				String surname = sc2.nextLine();
				System.out.println("-----------------------");
				System.out.println("Enter dob");
				String dob = sc2.nextLine();
				System.out.println("-----------------------");
				System.out.println("Enter adress");
				String adress = sc2.nextLine();
				System.out.println("-----------------------");
				System.out.println("Please enter the phone number");
				int phonenum = 0;
				phonenum = Employee.exc1(phonenum);
				System.out.println("-----------------------");
				System.out.println("Please enter the salary");
				double salary = 0;
				salary = Employee.exc2(salary);
				System.out.println("-----------------------");
				System.out.println("Enter position");
				String position = sc2.nextLine();
				Employee e1 = new Employee_Addition(name, surname, dob, adress, phonenum, salary, position); // The id
																												// and
																												// the
																												// position
																												// of
																												// the
				// employee
				// is irrelevant//
				System.out.println("The Employee has been added to the system");
				System.out.println("Name:" + e1.name + " " + "Surname:" + e1.surname + " " + "Id:" + e1.getId() + " "
						+ "Salary:" + e1.salary);
				choice = -1;
				continue;
			case 2:
				Employee.getSearch();
				System.out.println("Select the id of the Employee you want to erase");
				Scanner sc3 = new Scanner(System.in);
				int id1 = sc3.nextInt();
				Employee_Deletion.DeletionFin(id1);
				System.out.println("The Employee has been erased from the system");
				choice = -1;
				continue;
			case 3:
				System.out.println("Enter name/surname/salary/dob/address to search?");
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
				Salaries.SalSearch(pos);
				System.out.println("Select id");
				Scanner sc0 = new Scanner(System.in);
				int id3 = sc0.nextInt();
				System.out.println("Insert new salary");
				double sal = sc0.nextDouble();
				Salaries.SalEdit(sal, id3);
				System.out.println("The Employee salary has been edited");
				choice = -1;
				continue;
			case 5:
				Scanner scev = new Scanner(System.in);
				String evname = scev.nextLine();
				EvalAdd.addEvals(evname);
				System.out.println("Evaluation added");
				choice = -1;
				continue;
			case 6:
				Scanner scev1 = new Scanner(System.in);
				String evname1 = scev1.nextLine();
				EvalAddDynamic.addEvals(evname1);
				System.out.println("Evaluation added");
				choice = -1;
				continue;
			case 7:
				System.out.println("Here are the available Training Programs");
				TrpMethods.viewAll();
			case 8:
				Scanner sctrp1 = new Scanner(System.in);
				int trpmeth1 = sctrp1.nextInt();
				TrpMethods.viewEmpTrp(trpmeth1);
				choice = -1;
				continue;
			case 9:
				Scanner sctrp = new Scanner(System.in);
				int trpmeth = sctrp.nextInt();
				TrpMethods.updateEmpTrp(trpmeth);
				System.out.println("Employee/All employees trained!");
				choice = -1;
				continue;
			case 10:
				System.out.println("Thank you for using our menu");
				b = true;
				break;
			}
		}

	}
}