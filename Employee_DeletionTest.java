
class Employee_DeletionTest {

	public static void main(String[] args) {
		Employee ex1 = new Employee_Addition("Sam", "oifjvoj", "30/12/1990", "Spooky Street 5", "798782", 1900d,
				"wefef");
		Employee_Deletion.DeletionFin(ex1.getId());
		for (Employee Employees : Employee.Employees.values()) {
			System.out.println(Employees.getId());
		}
	}

}
