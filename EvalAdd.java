package TeamProject;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class EvalAdd {

	public static void addEvals(String fName) throws FileNotFoundException {
	

			Scanner input = new Scanner(new File(fName));
			while (input.hasNext()) {
				int empID = Integer.parseInt(input.nextLine().replaceAll("\\D", ""));
				String date = input.nextLine().replaceAll("\\D", "");
				int skillA = Integer.parseInt(input.nextLine().replaceAll("\\D", ""));
				int skillB = Integer.parseInt(input.nextLine().replaceAll("\\D", ""));
				int skillC = Integer.parseInt(input.nextLine().replaceAll("\\D", ""));

				Evaluation newEval = new Evaluation(empID, date, skillA, skillB, skillC);
				Employee.Employees.get(empID).evals.add(newEval);
				Evaluation.empEvals.add(newEval);
			
		}
		
	}
}