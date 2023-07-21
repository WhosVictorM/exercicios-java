package application;

import java.util.Scanner;

public class Udemy11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0;
		int[][] mat = new int[n][n];
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				mat[i][j] = sc.nextInt();
				if(mat[i][j] < 0) {
					count++;
				}
			}
		}
		System.out.println("Main Diagonal: ");
		for(int i=0; i<n; i++) {
			System.out.print(mat[i][i] + " ");
		}
		System.out.println();
		System.out.printf("Negative numbers: %d", count);
		
		
		sc.close();
	}

}
