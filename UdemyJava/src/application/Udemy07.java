package application;

import java.util.Scanner;

public class Udemy07 {
	/*	Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida, mostrar na tela
		o maior número do vetor (supor não haver empates). Mostrar também a posição do maior elemento,
		considerando a primeira posição como 0 (zero). 
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many numbers do you want to save? ");
		int n = sc.nextInt();
		int[] vect = new int[n];
		int max = 0;
		int pos = 0;
		
		for(int i=0; i<vect.length; i++) {
			System.out.println("Write a number: ");
			vect[i] = sc.nextInt();
			if(vect[i] > max) {
				max = vect[i];
				pos = i;
			}
		}
		System.out.printf("The MAX number of this VECTOR is %d\nAnd is located at position %d", max, pos);
		
		
		
		sc.close();
	}

}
