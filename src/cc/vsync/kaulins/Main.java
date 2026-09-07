package cc.vsync.kaulins;

import java.util.Random;

public class Main {
	static void mestKaulinu(int reizes) {
		int skaitlis;
		Random rand = new Random();
		for (int i = 0; i < reizes; i++) {
			skaitlis = rand.nextInt(6) + 1;
			System.out.printf("Uzkrita skaitlis: %d\n", skaitlis);
		}
	}
	
	public static void main(String[] args) {
		mestKaulinu(5);
	}
}
