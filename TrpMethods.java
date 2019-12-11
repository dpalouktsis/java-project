import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public class TrpMethods {

	public static List<TrainingProgram> viewAll() {
		return TrainingProgram.trainingPrograms;
	}

	public static List<TrainingProgram> viewEmpTrp(int id) {
		return Employee.Employees.get(id).reqTraining;
	}

	public static void updateEmpTrp(int empID) {

		if (empID != 0) {

			Employee employee = Employee.Employees.get(empID);
			List<Evaluation> tempEvals = employee.getEvals();
			Set<String> reqs = new HashSet<String>();

			for (int i = 0; i < tempEvals.size(); i++) {
				if (tempEvals.get(i).getYear() == 2018) {
					for (Entry<String, Integer> entry : tempEvals.get(i).skills.entrySet()) {
						if (entry.getValue() <= 2) {
							reqs.add(entry.getKey());
						}
					}
					break;
				}
			}
			for (int i = 0; i < TrainingProgram.trainingPrograms.size(); i++) {
				if (reqs.containsAll(TrainingProgram.trainingPrograms.get(i).trpSkills)) {
					employee.reqTraining.add(TrainingProgram.trainingPrograms.get(i));
					reqs.removeAll(TrainingProgram.trainingPrograms.get(i).trpSkills);
				}
			}
		}

		if (empID == 0) {
			for (Employee employee : Employee.Employees.values()) {

				List<Evaluation> tempEvals = employee.getEvals();
				Set<String> reqs = new HashSet<String>();

				for (int i = 0; i < tempEvals.size(); i++) {
					if (tempEvals.get(i).getYear() == 2018) {
						for (Entry<String, Integer> entry : tempEvals.get(i).skills.entrySet()) {
							if (entry.getValue() <= 2) {
								reqs.add(entry.getKey());
							}
						}
						break;
					}
				}
				for (int i = 0; i < TrainingProgram.trainingPrograms.size(); i++) {
					if (reqs.containsAll(TrainingProgram.trainingPrograms.get(i).trpSkills)) {
						employee.reqTraining.add(TrainingProgram.trainingPrograms.get(i));
						reqs.removeAll(TrainingProgram.trainingPrograms.get(i).trpSkills);
					}
				}
			}

		}
	}
}
