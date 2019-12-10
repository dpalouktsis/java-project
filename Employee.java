import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Employee {
	public String name;
	public String surname;
	public String dob;// date of birth//
	public String adress;
	public int id;
	public String phonenum;
	public String status;
	private static final AtomicInteger count = new AtomicInteger(0);
	static HashMap<Integer, Employee> Employees = new HashMap<Integer, Employee>();
	public List<Evaluation> evals = new ArrayList<Evaluation>();
	public List<TrainingProgram> reqTraining = new ArrayList<TrainingProgram>();
	
	public List<Evaluation> getEvals(){
		return evals;
	}
	public int getID() {
		return id;
	}

	public Employee(String name, String surname, String dob, String adress, int id, String phonenum, String status) {

		this.name = name;
		this.surname = surname;
		this.dob = dob;
		this.adress = adress;
		this.id = id;
		this.phonenum = phonenum;
		this.evals = new ArrayList<Evaluation>();
		id = count.incrementAndGet();
		Employees.put(this.id, this);
	}
	@Override
	public String toString() {
		return String.format("ID: %d\r\nFirst Name: %s\r\nLast Name: %s\r\nAdress: %s\r\nPhone Number: %s\r\n", id, name, surname, adress, phonenum);
	}

}