package TeamProject;

import java.util.ArrayList;
import java.util.List;

public class Evaluation {

	protected int empID;
	protected String date;
	protected int skillA;
	protected int skillB;
	protected int skillC;

	public Evaluation(int i, String d, int a, int b, int c) {
		this.empID = i;
		this.date = d.substring(0, 2) + "/" + d.substring(2, 4) + "/" + d.substring(4, 8);
		this.skillA = a;
		this.skillB = b;
		this.skillC = c;
	}

	public int getEmpID() {
		return empID;
	}

	public void setEmpID(int empID) {
		this.empID = empID;
	}

	public String getDate() {
		return date;
	}

	public int getYear() {
		return Integer.parseInt(date.substring(6, 10));
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getSkillA() {
		return skillA;
	}

	public void setSkillA(int skillA) {
		this.skillA = skillA;
	}

	public int getSkillB() {
		return skillB;
	}

	public void setSkillB(int skillB) {
		this.skillB = skillB;
	}

	public int getSkillC() {
		return skillC;
	}

	public void setSkillC(int skillC) {
		this.skillC = skillC;
	}

	public static List<Evaluation> getEmpEvals() {
		return empEvals;
	}

	public static void setEmpEvals(List<Evaluation> empEvals) {
		Evaluation.empEvals = empEvals;
	}

	@Override
	public String toString() {
		return String.format("ID: %d\r\nDate: %s\r\nA: %d\r\nB: %d\r\nC: %d\r\n", empID, date, skillA, skillB, skillC);
	}

	public static List<Evaluation> empEvals = new ArrayList<Evaluation>();

}
