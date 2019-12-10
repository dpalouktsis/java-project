import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Employee E1 = new Employee("George", "Papadopoulos", "01/02/1980", "Oxford Street 4", 1, "76372", "single");
		Employee E2 = new Employee("John", "Lennon", "11/04/1960", "Weird Street 90", 2, "52543", "married");
		Employee E3 = new Employee("Alex", "Turner", "1/01/1988", "Weirded Street 14", 3, "34242", "single");
		Employee E4 = new Employee("James", "Hetfield", "21/02/1972", "Scary Street 47", 4, "09772", "married");
		Employee E5 = new Employee("Sam", "Carter", "30/12/1990", "Spooky Street 5", 5, "798782", "single");

		try {
			EvalAdd.addEvals("eval2.txt");
			EvalAdd.addEvals("eval1.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(EvalSearch.idSearch(3));

		EvalSearch.getPercentage(50, 0);

		Set<String> skills = new HashSet<String>();

		skills.add("SkillB");

		TrainingProgram trp1 = new TrainingProgram(1, skills, "bla");
		Set<String> skills1 = new HashSet<String>();

		skills1.add("SkillC");
		skills1.add("SkillA");
		TrainingProgram trp2 = new TrainingProgram(2, skills1, "bla");

		TrpMethods.updateEmpTrp(0);
		System.out.println(Employee.Employees.get(3).reqTraining);
	}
}
