package application;

import java.util.Scanner;

/*
  	Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
	- Imprimir todos os elementos do vetor
	- Mostrar na tela a soma e a média dos elementos do vetor
   
 */
public class Udemy04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] vect = new int[n];
		int sum = 0;
		
		for(int i=0; i<vect.length; i++) {
			vect[i] = sc.nextInt();
			sum += vect[i];
		}
		double avg = sum / n;
		System.out.print("Values:");
		for(int i=0; i<vect.length; i++) {
			System.out.print(" " + vect[i] + " ");
		}
		System.out.printf("\nSum: %d\n", sum);
		System.out.printf("AVG: %.2f", avg);
		
		sc.close();
	}

}
