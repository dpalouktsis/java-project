package TeamProject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class Employee {
	private static final AtomicInteger count = new AtomicInteger(0);
	public String name;
	public String surname;
	public String dob;// date of birth//
	public String adress;
	private final int id;
	public int phonenum;
	public double salary;
	public String position;
	static HashMap<Integer, Employee> Employees = new HashMap<Integer, Employee>();
	public ArrayList<Evaluation> evals = new ArrayList<Evaluation>();
	public ArrayList<TrainingProgram> reqTraining = new ArrayList<TrainingProgram>();

	public Employee(String name, String surname, String dob, String adress, int phonenum2, double salary,
			String position) {

		this.name = name;
		this.surname = surname;
		this.dob = dob;
		this.adress = adress;
		this.phonenum = phonenum2;
		this.salary = salary;
		this.position = position;
		this.evals = new ArrayList<Evaluation>();
		boolean b = true;
		while (b) {
			if (this.salary > 758 && this.salary <= 1100) {
				this.position = "lowsalary";
				b = false;
			} else if (this.salary > 1100 && this.salary <= 1900) {
				this.position = "mediumsalary";
				b = false;
			} else if (this.salary > 1900) {
				this.position = "highsalary";
				b = false;
			} else {
				System.out.println("The salary is too low");
				Scanner scsal = new Scanner(System.in);
				this.salary = scsal.nextDouble();
			}
		}

		this.id = count.getAndIncrement();
		Employees.put(this.id, this);
	}

	public int getId() {
		return id;
	}

	public ArrayList<Evaluation> getEvals() {
		return evals;
	}

	static void Search(String crit) {
		for (Employee Employees : Employee.Employees.values()) {
			if ((Employees.name).contains(crit) || (Employees.surname).contains(crit)
					|| (Employees.dob).contains(crit)) {
				System.out.println(Employees.name);
				System.out.println(Employees.surname);
				System.out.println(Employees.dob);
				System.out.println(Employees.getId());

			}

		}

	}

	public static void getSearch() {
		Scanner sc0 = new Scanner(System.in);
		System.out.println("By which criteria do you want to search?");
		String crit = sc0.nextLine();
		if (crit != null) {
			Employee.Search(crit);
		} else {
			System.out.println("No results found");
		}

	}

	public static double exc2(double salary) {
		boolean b11 = false;
		double salary1;
		Scanner sc2exc = new Scanner(System.in);
		do {
			salary1 = 0;
			try {
				salary1 = sc2exc.nextDouble();
				b11 = true;
			} catch (InputMismatchException e) {
				System.err.println("Please insert a valid salary");
				sc2exc.nextLine();
			}

		} while (b11 == false);
		return salary1;
	}

	public static int exc1(int phonenum) {
		boolean b1 = false;
		int phonenum1 = 0;
		Scanner sc2exc = new Scanner(System.in);
		do {
			try {
				phonenum1 = sc2exc.nextInt();
				b1 = true;
			} catch (InputMismatchException e) {
				System.err.println("Please insert a valid phone number");
				sc2exc.nextLine();
			}
		} while (b1 == false);
		return phonenum1;
	}
}
