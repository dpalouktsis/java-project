
class EmployeeTest {

	public static void main(String[] args) {
		Employee ex1 = new Employee("Sam", "oifjvoj", "30/12/1990", "Spooky Street 5", "798782", 1900d, "wefef");
		Employee ex2 = new Employee("Sam", "oifjvoj", "30/12/1990", "Spooky wfwefStreet 5", "798782", 1900d, "wefef");
		System.out.println(ex1.getId());
		System.out.println(ex2.getId());
		System.out.println(ex1.getEvals());
		System.out.println(ex2.getEvals());
	}

}
