import java.io.*;
	public class EmployeeTest {
		public static void main(String args[]) {
			/* Create two objects using constructor */
			Employee empOne = new Employee("Yaseen Khaskheli");
			Employee empTwo = new Employee("Arif Ali SHah");
			// Invoking methods for each object created
			empOne.empAge(17);
			empOne.empDesignation("Internee");
			empOne.empSalary(10000);
			empOne.printEmployee();
			empTwo.empAge(51);
			empTwo.empDesignation("Software Engineer");
			empTwo.empSalary(15000);
			empTwo.printEmployee();
		}
}