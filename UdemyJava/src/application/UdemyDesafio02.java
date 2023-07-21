package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employee;

public class UdemyDesafio02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many employees will be registered? ");
		int n = sc.nextInt();
		
		List<Employee> list = new ArrayList<Employee>();
		
		for(int i=0; i<n; i++) {
			System.out.printf("Employee #%d", i+1);
			System.out.println("ID: ");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.println("NAME: ");
			String name = sc.nextLine();
			System.out.println("SALARY: ");
			double salary = sc.nextDouble();
			Employee employee = new Employee(name, id, salary);
			list.add(employee);
		}
		System.out.println("Enter the employee ID that will have salary increased: ");
		int increase = sc.nextInt();
		
		
		boolean found = false;
		for(Employee employee : list) {
			if(employee.getId() == increase) {
				System.out.println("Percentage amount to be increased: ");
				double percentage = sc.nextInt();
				employee.increaseSalary(percentage);
				found = true;
				break;
			}
		}
		if(!found) {
			System.out.println("ID not FOUND");
		}
		for(Employee employee : list) {
			System.out.println(employee);
		}
		
		sc.close();
	}

}
