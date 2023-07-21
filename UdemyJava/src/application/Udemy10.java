package application;

import java.util.Scanner;

public class Udemy10 {
	/*	Fazer um programa para ler um vetor de N números inteiros. Em seguida, mostrar na tela a média
		aritmética somente dos números pares lidos, com uma casa decimal. Se nenhum número par for
		digitado, mostrar a mensagem "NENHUM NUMERO PAR"
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many numbers do you want to save? ");
		int n = sc.nextInt();
		double[] vect = new double[n];
		double sum = 0;
		int count = 0;
		
		for(int i=0; i<vect.length; i++) {
			System.out.println("Write a number: ");
			vect[i] = sc.nextDouble();
			if(vect[i] % 2 == 0) {
				sum += vect[i];
				count += 1;
			}
		}
		double avg = sum / count;
		if(count > 0) {
			System.out.printf("The AVG of PAIR NUMBERS is: %.1f\n", avg);
		}
		else {
			System.out.println("NULL");
		}
		
		
		sc.close();
	}

}
