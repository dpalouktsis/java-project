package TeamProject;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import javax.swing.JOptionPane;

public class Employee {
	private static final AtomicInteger count = new AtomicInteger(0);
	public String name;
	public String surname;
	public String dob;// date of birth//
	public String adress;
	private final int id;
	public String phonenum;
	public String status;
	static ArrayList<Employee> Employees = new ArrayList<Employee>();
	
	public Employee(String name, String surname, String dob, String adress, String phonenum) {

		this.name = name;
		this.surname = surname;
		this.dob = dob;
		this.adress = adress;
		this.phonenum = phonenum;
		this.id = count.getAndIncrement();
		Employees.add(this);
	}

	public int getId() {
		return id;
	}

	static void Search(String crit) {
		for (Employee Employees : Employees) {
			if ((Employees.name).contains(crit) || (Employees.surname).contains(crit) || (Employees.dob).contains(crit)
					|| (Employees.adress).contains(crit) || (Employees.phonenum).contains(crit)) {
				System.out.println(Employees.name);
				System.out.println(Employees.surname);
				System.out.println(Employees.dob);
				System.out.println(Employees.getId());

			}

		}

	}

	public static void getSearch() {

		String crit = JOptionPane.showInputDialog(null, "Please type what you are looking for", JOptionPane.OK_OPTION);
		if (crit != null) {
			Employee.Search(crit);
		} else {
			System.out.println("No results found");
		}

	}

	static void DeletionFin(int id1) {
		Employees.remove(id1);
	}
}