package application;

import java.util.Scanner;

public class Udemy01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double sum = 0;
		int n = sc.nextInt();
		
		double[] vect = new double[n];
		
		for(int i = 0; i < n; i++) {
			vect[i] = sc.nextDouble();
			sum += vect[i];
		}
		System.out.println(sum / n);
		
		sc.close();
		
		
	}

}
