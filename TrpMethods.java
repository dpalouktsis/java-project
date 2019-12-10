package TeamProject;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TrpMethods {

	public static List<TrainingProgram> viewAll() {
		return TrainingProgram.trainingPrograms;
	}

	public static List<TrainingProgram> viewEmpTrp(int id) {
		return Employee.Employees.get(id).reqTraining;
	}

	public static void updateEmpTrp(int empID) {

		if (empID != 999999999) {

			Employee employee = Employee.Employees.get(empID);
			List<Evaluation> tempEvals = employee.getEvals();
			Set<String> reqs = new HashSet<String>();// gia kathe upallhlo pou pernaei ftiaxnei set gia na dei se poia
														// skills xreiazetai beltiwsh mesw twn aksiloghsewn//

			for (int i = 0; i < tempEvals.size(); i++) {
				if (tempEvals.get(i).getYear() == 2018) {
					if (tempEvals.get(i).getSkillA() <= 2) {
						reqs.add("SkillA");
					}
					if (tempEvals.get(i).getSkillB() <= 2) {
						reqs.add("SkillB");
					}
					if (tempEvals.get(i).getSkillC() <= 2) {
						reqs.add("SkillC");
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

		if (empID == 9999999) {
			for (Employee employee : Employee.Employees.values()) {

				List<Evaluation> tempEvals = employee.getEvals();
				Set<String> reqs = new HashSet<String>();

				for (int i = 0; i < tempEvals.size(); i++) {
					if (tempEvals.get(i).getYear() == 2018) {
						if (tempEvals.get(i).getSkillA() <= 2) {
							reqs.add("SkillA");
						}
						if (tempEvals.get(i).getSkillB() <= 2) {
							reqs.add("SkillB");
						}
						if (tempEvals.get(i).getSkillC() <= 2) {
							reqs.add("SkillC");
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