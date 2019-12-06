import java.util.HashMap;

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

	@Override
	public String toString() {
		return String.format("ID: %d\r\nDate: %s\r\nA: %d\r\nB: %d\r\nC: %d\r\n", empID, date, skillA, skillB, skillC);
	}

	public static HashMap<Integer, HashMap<String, Evaluation>> empEvals = new HashMap<Integer, HashMap<String, Evaluation>>();

}
