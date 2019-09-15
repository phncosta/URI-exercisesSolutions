package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		for (int i = 1; i < 3; i++) {
			for (int j = 0; j <= 2; j += 2) {
				System.out.printf("%d %d%n", i, j);
			}
		}

		input.close();
	}

}
