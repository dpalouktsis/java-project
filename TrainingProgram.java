package TeamProject;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TrainingProgram {

	protected int trpID;
	protected Set<String> trpSkills = new HashSet<String>();
	protected String trpDesc;
	public static List<TrainingProgram> trainingPrograms = new ArrayList<TrainingProgram>();

	public static int noOfSkills(TrainingProgram trp) {
		return trp.trpSkills.size();
	}

	public static void sort() {
		trainingPrograms.sort(Comparator.comparing(TrainingProgram::noOfSkills).reversed()); // se auta pou boithane sta
																								// perissotera skills me
																								// fthniousa seira//
	}

	public TrainingProgram(int id, Set<String> skills, String desc) {
		this.trpID = id;
		this.trpSkills = skills;
		this.trpDesc = desc;
		trainingPrograms.add(this);
		sort();
	}

	@Override
	public String toString() {
		return String.format("ID: %d\r\nRelevant Skills: %s\r\nDesc: %s\r\n", trpID, trpSkills, trpDesc);
	}
}