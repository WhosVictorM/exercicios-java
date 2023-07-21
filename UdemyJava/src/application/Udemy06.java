package application;

import java.util.Scanner;

public class Udemy06 {
	/* 	Faça um programa que leia N números inteiros e armazene-os em um vetor. Em seguida, mostre na
		tela todos os números pares, e também a quantidade de números pares. 
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many numbers do you want do save? ");
		int n = sc.nextInt();
		int[] vect = new int[n];
		int count = 0;
		
		for(int i=0; i<vect.length; i++) {
			System.out.println("Write a number: ");
			vect[i] = sc.nextInt();
			if(vect[i] % 2 == 0) {
				count += 1;
			}
		}
		System.out.printf("\nIn this vector have %d PAIR NUMBERS\n", count);
		for(int i=0; i<vect.length; i++) {
			if(vect[i] % 2 == 0) {
				System.out.printf(" %d ", vect[i]);
			}
		}
		
		sc.close();
	}

}
