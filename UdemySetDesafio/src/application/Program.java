package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Set<Integer> a = new HashSet<>();
		Set<Integer> b = new HashSet<>();
		Set<Integer> c = new HashSet<>();
		

		System.out.println("How many students for course A? ");
		int courseA = sc.nextInt();

		for (int i = 0; i < courseA; i++) {
			int students = sc.nextInt();
			a.add(students);
		}

		System.out.println("How many students for course B? ");
		int courseB = sc.nextInt();
		
		for (int i = 0; i < courseB; i++) {
			int students = sc.nextInt();
			b.add(students);
		}

		System.out.println("How many students for course C? ");
		int courseC = sc.nextInt();
		
		for (int i = 0; i < courseC; i++) {
			int students = sc.nextInt();
			c.add(students);
		}
		
		Set<Integer> total = new HashSet<>(a);
		total.addAll(b);
		total.addAll(c);
		
		System.out.println("Total Students: " + total.size());

		sc.close();
	}

}
