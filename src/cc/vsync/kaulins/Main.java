package cc.vsync.kaulins;

import java.util.Random;

public class Main {
	static void mestKaulinu() {
		int skaitlis;
		Random rand = new Random();
		skaitlis = rand.nextInt(6) + 1;
		System.out.printf("Uzkrita skaitlis: %d\n", skaitlis);
	}
	
	public static void main(String[] args) {
		mestKaulinu();
	}
}
