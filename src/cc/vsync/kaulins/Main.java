package cc.vsync.kaulins;

import java.util.Random;
import java.util.Scanner;

public class Main {
	static int mestKaulinu(int reizes) {
		int skaitlis;
		Random rand = new Random();
		
		int min = 6;
		
		for (int i = 0; i < reizes; i++) {
			skaitlis = rand.nextInt(6) + 1;
			System.out.printf("Uzkrita skaitlis: %d\n", skaitlis);
			if (skaitlis < min)
				min = skaitlis;
		}
		
		return min;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Cik reizes mest kauliņu?");
		int reizes = sc.nextInt();
		
		System.out.printf("Mazākais skaitlis no visiem metieniem: %s\n".formatted(mestKaulinu(reizes)));

		sc.close();
	}
}
