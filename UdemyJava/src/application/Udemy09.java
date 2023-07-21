package application;

import java.util.Scanner;

public class Udemy09 {
	/*	Fazer um programa para ler um número inteiro N e depois um vetor de N números reais. Em seguida,
		mostrar na tela a média aritmética de todos elementos com três casas decimais. Depois mostrar todos
		os elementos do vetor que estejam abaixo da média, com uma casa decimal cada. 
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many numbers do you want to save? ");
		int n = sc.nextInt();
		double[] vect = new double[n];
		double sum = 0;
		
		for(int i=0; i<vect.length; i++) {
			System.out.println("Write a number: ");
			vect[i] = sc.nextDouble();
			sum += vect[i];
		}
		double avg = sum / n;
		System.out.printf("The AVG is %.3f\n", avg);
		
		for(int i=0; i<vect.length; i++) {
			if(vect[i]<avg) {
				System.out.printf("%.1f\n", vect[i]);
			}
		}
		
	}

}
