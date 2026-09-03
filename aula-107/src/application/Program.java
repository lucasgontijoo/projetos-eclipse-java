package application;

import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.List;
import entities.Employee;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employee> list = new ArrayList<>();
		
		int quantityEmployees = 0;
		
		System.out.print("How many employees will be registered? ");
		quantityEmployees = sc.nextInt();
		System.out.println();
		
		for(int i = 0; i<quantityEmployees; i++) {
			Integer id = 0;
			String name = "";
			Double salary = 0.0;
			
			System.out.printf("Employee #%d:\n", (i+1));
			System.out.print("Id: ");
			id = sc.nextInt();
			sc.nextLine();
			System.out.print("Name: ");
			name = sc.nextLine();
			
			System.out.print("Salary: ");
			salary = sc.nextDouble();
			System.out.println();
			
			Employee employee = new Employee(id, name, salary);
			list.add(employee);
		}
		System.out.print("Enter the employee id that will have salary increase : ");
		int increaseSalaryId = sc.nextInt();
		
		if(list.stream().filter(employee -> employee.getId() == increaseSalaryId).findFirst().orElse(null) == null) {
			System.out.println("This id does not exist!");
			System.out.println();
		} else {
			double percentage = 0.0;
			System.out.print("Enter the percentage: ");
			percentage = sc.nextDouble();
			
			System.out.println();
			
			List<Employee> result = list.stream().filter(employee -> employee.getId() == increaseSalaryId).collect(Collectors.toList());
			Employee employee = result.get(0);
			employee.increaseSalary(percentage);
		}
		
		System.out.println("List of employees: ");
		for(Employee employee: list) {
			System.out.println(employee);
		}
		
		sc.close();
	}
}
