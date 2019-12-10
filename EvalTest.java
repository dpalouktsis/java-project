
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class EvalTest {

	public static void addEvals() throws FileNotFoundException {
		Employee jdoe = new Employee(null, null, null, null, 1025, null, null);
		Employee msmith = new Employee(null, null, null, null, 1026, null, null);
		for (int i = 1; i < 3; i++) {
			Scanner input = new Scanner(new File("eval" + i + ".txt"));
			while (input.hasNext()) {
				int empID = Integer.parseInt(input.nextLine().replaceAll("\\D", ""));
				String date = input.nextLine().replaceAll("\\D", "");
				int skillA = Integer.parseInt(input.nextLine().replaceAll("\\D", ""));
				int skillB = Integer.parseInt(input.nextLine().replaceAll("\\D", ""));
				int skillC = Integer.parseInt(input.nextLine().replaceAll("\\D", ""));

				Evaluation newEval = new Evaluation(empID, date, skillA, skillB, skillC);
				Evaluation.empEvals.add(newEval);
			}
		}
		EvalSearch.skillsSearch("bla");
		System.out.println("id"+"\n"+EvalSearch.idSearch(4));
		System.out.println("date"+EvalSearch.dateSearch("2018"));
	}
}