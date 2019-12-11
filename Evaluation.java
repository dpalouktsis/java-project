import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Evaluation {

	protected int empID;
	protected String date;
	public HashMap<String, Integer> skills = new HashMap<String, Integer>();

	public Evaluation(int i, String d) {
		this.empID = i;
		this.date = d.substring(0, 2) + "/" + d.substring(2, 4) + "/" + d.substring(4, 8);
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

	
	public static List<Evaluation> getEmpEvals() {
		return empEvals;
	}

	public static void setEmpEvals(List<Evaluation> empEvals) {
		Evaluation.empEvals = empEvals;
	}
	
	public Integer getScore(String skill) {
		return skills.get("skill");
	}

	@Override
	public String toString() {
		return "Evaluation [empID=" + empID + ", date=" + date + ", skills=" + skills + "]";
	}


	public static List<Evaluation> empEvals = new ArrayList<Evaluation>();

}
