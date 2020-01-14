package TeamProject;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Employee_AdditionTest {

	@Test

	public static void main(String[] args) {
		Employee ex1 = new Employee_Addition("Sam", "oifjvoj", "30/12/1990", "Spooky Street 5", 435435, 1900d, "wefef");
		Employee ex2 = new Employee_Addition("Sam", "oifjvoj", "30/12/1990", "Spooky wfwefStreet 5", 34534534, 1900d,
				"wefef");
		System.out.println(ex1.getId());
		System.out.println(ex2.getId());
		System.out.println(ex1.getEvals());
		System.out.println(ex2.getEvals());
	}

}
