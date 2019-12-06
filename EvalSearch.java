import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public class EvalSearch {

	public static List<Integer> skillsSearch(String terms) { // to skeftomai akoma auto pws tha doulepsei//
		List<Integer> result = new ArrayList<Integer>();
		List keys = new ArrayList(Evaluation.empEvals.keySet());
		for (int i = 0; i < keys.size(); i++) {
			HashMap<String, Evaluation> temp = Evaluation.empEvals.get(keys.get(i));
			for (Entry<String, Evaluation> entry : temp.entrySet()) {
				if (entry.getValue().skillB > 3) {
					result.add((Integer) keys.get(i));
				}
			}
		}
		return result;
	}

	public static HashMap<String, Evaluation> idSearch(int empID) { // fernei ta evaluations vasei ID//
		return Evaluation.empEvals.get(empID);
	}

	public static List<Evaluation> dateSearch(String date) {// fernei ta evaluations vasei hmeromhnias//
		List<Evaluation> result = new ArrayList<Evaluation>();
		List keys = new ArrayList(Evaluation.empEvals.keySet());
		for (int i = 0; i < keys.size(); i++) {
			HashMap<String, Evaluation> temp = Evaluation.empEvals.get(keys.get(i));
			for (Entry<String, Evaluation> entry : temp.entrySet()) {
				if (entry.getKey().equals(date)) {
					result.add(entry.getValue());
				}
			}
		}
		return result;
	}
}
