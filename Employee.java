package TeamProject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

public class Employee {
	public String name;
	public String surname;
	public String dob;// date of birth//
	public String adress;
	public int id;
	public String phonenum;
	public String status;
	// private static final AtomicInteger count = new AtomicInteger(0);//
	static ArrayList<Employee> Employees = new ArrayList<Employee>();

	public Employee(String name, String surname, String dob, String adress, int id, String phonenum, String status) {

		this.name = name;
		this.surname = surname;
		this.dob = dob;
		this.adress = adress;
		Random rd = new Random();
		this.id = 1000 + rd.nextInt(9000);
		// Collections.shuffle(Employees);//
		this.phonenum = phonenum;
		Employees.add(this);
	}

}
