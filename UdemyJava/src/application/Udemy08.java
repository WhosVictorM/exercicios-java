package application;

import java.util.Scanner;

public class Udemy08 {
	/*	Faça um programa para ler dois vetores A e B, contendo N elementos cada. Em seguida, gere um
		terceiro vetor C onde cada elemento de C é a soma dos elementos correspondentes de A e B. Imprima
		o vetor C gerado. 
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many numbers do you want to save? ");
		int n = sc.nextInt();
		int[] vectA = new int[n];
		int[] vectB = new int[n];
		int[] vectC = new int[n];
		
		for(int i=0; i<vectA.length; i++) {
			System.out.println("Write a number A: ");
			vectA[i] = sc.nextInt();
		}
		for(int i=0; i<vectB.length; i++) {
			System.out.println("Write a number B: ");
			vectB[i] = sc.nextInt();
			vectC[i] = vectA[i] + vectB[i];
		}
		for(int i=0; i<vectC.length; i++) {
			System.out.printf("%d\t", vectC[i]);
		}
		
		
		sc.close();
	}

}
