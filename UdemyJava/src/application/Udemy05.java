package application;

import java.util.Scanner;

import entities.People;
/*
  	Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na
	tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos,
	bem como os nomes dessas pessoas caso houver.
 */
public class Udemy05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		People[] pp = new People[n];
		double sumH = 0;
		int count = 0;
		
		for(int i=0; i<pp.length; i++) {
			System.out.printf("\nPeople %d Data\n", i);
			System.out.println("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Age: ");
			int age = sc.nextInt();
			System.out.println("Height: ");
			double height = sc.nextDouble();
			pp[i] = new People(name, age, height);
			if(pp[i].getAge() < 16) {
				count += 1;
			}
			
			sumH += pp[i].getHeight();
		}
		double avgA = (count * 100) / n;
		double avg = sumH / n;
		
		System.out.printf("AVG Height: %.2f\n", avg);
		System.out.printf("< 16 Years: %.1f%%\n", avgA);
		
		for(int i=0; i<pp.length; i++) {
			if(pp[i].getAge() < 16) {
				System.out.println(pp[i].getName());
			}
		}		
		sc.close();
	}

}
