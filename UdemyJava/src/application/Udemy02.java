package application;

import java.util.Scanner;

import entities.Product;

public class Udemy02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		Product[] vect = new Product[n];
		double sum = 0;
		
		for (int i = 0; i < n; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			vect[i] = new Product(name, price);
			sum += vect[i].getPrice();
		}
		
		System.out.printf("AVG price: %.2f", (sum / 3));
		sc.close();
	}

}
