package com.codegnan.abstraction;

public class EmployeeSalaries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new FullTimeEmployee("Alice", 50000);
		Employee e2 = new PartTimeEmployee("Bob", 500, 40);
		Employee e3 = new ContractEmployee("Charlie", 80000);
		
		Employee[] list = {e1, e2, e3};
		
		for(Employee emp: list) {
			emp.display();
			System.out.println("Salary: "+emp.calculateSalary());
			System.out.println("=================================");
			System.out.println();
		}
	}

}
