package TeamProject;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class EvalAddDynamic {

	public static void addEvals(String fName) throws FileNotFoundException {

		Scanner input = new Scanner(new File(fName));

		int empID = Integer.parseInt(input.nextLine().replaceAll("\\D", ""));
		String date = input.nextLine().replaceAll("\\D", "");
		Evaluation newEval = new Evaluation(empID, date);
		while (input.hasNext()) {
			String line = input.nextLine();
			String str[] = line.split(":");
			newEval.skills.put(str[0], Integer.parseInt(str[1]));

		}

		Employee.Employees.get(empID).evals.add(newEval);
		Evaluation.empEvals.add(newEval);

	}

}