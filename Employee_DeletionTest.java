package TeamProject;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Employee_DeletionTest {

	@Test
	public static void main(String[] args) {
		Employee ex1 = new Employee_Addition("Sam", "oifjvoj", "30/12/1990", "Spooky Street 5", 32535, 1900d, "wefef");
		Employee_Deletion.DeletionFin(ex1.getId());
		for (Employee Employees : Employee.Employees.values()) {
			System.out.println(Employees.getId());
		}
	}
}
