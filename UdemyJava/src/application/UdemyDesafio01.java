package application;

import java.util.Scanner;

import entities.Students;

public class UdemyDesafio01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many Students will rent a room? ");
		int n = sc.nextInt();
		Students[] ss = new Students[9];
		
		for(int i=0; i<n; i++) {
			System.out.printf("Rent #%d\n", i+1);
			System.out.println("Student name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Student Email: ");
			String email = sc.nextLine();
			System.out.println("Room: ");
			int room = sc.nextInt();
			ss[room] = new Students(name, room, email);
			
		}
		System.out.println("Bussy rooms: ");
		for(int i=0; i<ss.length; i++) {
			if(ss[i]!= null) {
				System.out.printf("%d: %s, %s\n", ss[i].getRoom(), ss[i].getName(), ss[i].getEmail());
			}
		}
		
		sc.close();
	}

}
