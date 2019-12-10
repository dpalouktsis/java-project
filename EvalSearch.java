import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public class EvalSearch {

	public static List<Integer> skillsSearch(String terms) { // to skeftomai akoma auto pws tha doulepsei//
		List<Integer> result = new ArrayList<Integer>();
		for (int i = 0; i < Evaluation.empEvals.size(); i++) {
					if (Evaluation.empEvals.get(i).getSkillB() > 3);
					result.add(Evaluation.empEvals.get(i).empID);
				}
		
        Set<Integer> set = new LinkedHashSet<>(); 
        set.addAll(result); 
        result.clear(); 
        result.addAll(set); 
	
        return result;
	}

	public static List<Evaluation> idSearch(int empID) { // fernei ta evaluations vasei ID//
		
		List<Evaluation> result = new ArrayList<Evaluation>();
		result = Employee.Employees.get(empID).evals;
		
		return result;
	}

	public static List<Evaluation> dateSearch(String date) {// fernei ta evaluations vasei hmeromhnias//
		int i;
		List<Evaluation> result = new ArrayList<Evaluation>();
		for (i = 0; i < Evaluation.empEvals.size(); i++) {
			if (Evaluation.empEvals.get(i).date.equals(date)) {
				result.add(Evaluation.empEvals.get(i));
			}
		}
		return result;
	}
	
	public static List<Integer> getPercentage(int percentage, int mod) {
		
		
		double multiplier = percentage * 0.01;
		List<Integer> result = new ArrayList<Integer>();
		List<Evaluation> temp = new ArrayList<Evaluation>();
		
		for (int i = 0; i < Evaluation.empEvals.size(); i++) {
			if (Evaluation.empEvals.get(i).getYear() == 2018);
			temp.add(Evaluation.empEvals.get(i));
		}
		
		if (mod == 1) {
			temp.sort(Comparator.comparing(Evaluation::getSkillB).reversed());
			
		} else {
			temp.sort(Comparator.comparing(Evaluation::getSkillB));
		}
		
		
		
		for (int i = 0; i < Math.ceil(temp.size() * multiplier); i++) {
			result.add(temp.get(i).empID);
		}
		
		return result;
		
		
		
	}
}
