package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Data;
import entities.JPerson;
import entities.PPerson;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<Data> list = new ArrayList<>();
		
		System.out.print("Number of tax payers: ");
		int n = sc.nextInt();
		for(int i=0; i<n; i++) {
			System.out.printf("Tax payers #%s data: \n", i+1);
			System.out.print("Individual or Company (i/c)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Annual Incoming: ");
			double annualIncoming = sc.nextDouble();
			if(ch == 'i') {
				System.out.print("Health expenses: ");
				double healthExpenses = sc.nextDouble();
				Data person = new PPerson(name, annualIncoming, healthExpenses);
				list.add(person);
			} else {
				System.out.print("Number of employees: ");
				int quantityEmployees = sc.nextInt();
				Data person = new JPerson(name, annualIncoming, quantityEmployees);
				list.add(person);
			}
		}
		System.out.println("\nTAXES PAID: ");
		double sum = 0;
		for(Data person : list) {
			System.out.printf("%s: $%.2f\n", person.getName(), person.tax());
			sum += person.tax();
		}
		System.out.printf("\nTOTAL TAXES: $%.2f", sum);
		sc.close();
	}

}
