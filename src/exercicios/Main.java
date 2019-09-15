package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double n100, n50, n20, n10, n5, n2, c1, c50, c25, c10, c05, c01;
		float N = sc.nextFloat();

		n100 = N / 100.0;
		N %= 100.0;
		n50 = N / 50.0;
		N %= 50.0;
		n20 = N / 20.0;
		N %= 20.0;
		n10 = N / 10.0;
		N %= 10.0;
		n5 = N / 5.0;
		N %= 5.0;
		n2 = N / 2.0;
		N %= 2.0;
		c1 = N / 1.0;
		N %= 1.0;
		c50 = N / 0.5;
		N %= 0.5;
		c25 = N / 0.25;
		N %= 0.25;
		c10 = N / 0.10;
		N %= 0.10;
		c05 = N / 0.05;
		N %= 0.05;
		c01 = N / 0.01;
		
		System.out.println("NOTAS:");
		System.out.printf((int) n100 + " nota(s) de R$ 100.00%n");
		System.out.printf((int) n50 + " nota(s) de R$ 50.00%n");
		System.out.printf((int) n20 + " nota(s) de R$ 20.00%n");
		System.out.printf((int) n10 + " nota(s) de R$ 10.00%n");
		System.out.printf((int) n5 + " nota(s) de R$ 5.00%n");
		System.out.printf((int) n2 + " nota(s) de R$ 2.00%n");
		System.out.println("MOEDAS:");
		System.out.printf((int) c1 + " moeda(s) de R$ 1.00%n");
		System.out.printf((int) c50 + " moeda(s) de R$ 0.50%n");
		System.out.printf((int) c25 + " moeda(s) de R$ 0.25%n");
		System.out.printf((int) c10 + " moeda(s) de R$ 0.10%n");
		System.out.printf((int) c05 + " moeda(s) de R$ 0.05%n");
		System.out.printf((int) c01 + " moeda(s) de R$ 0.01%n");
		
		sc.close();
	}
}
