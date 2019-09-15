import java.util.Locale;
import java.util.Scanner;

public class uri1010 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int cod, numPeca1, numPeca2;
		double valor1, valor2, total;

		cod = sc.nextInt();
		numPeca1 = sc.nextInt();
		valor1 = sc.nextDouble();
		cod = sc.nextInt();
		numPeca2 = sc.nextInt();
		valor2 = sc.nextDouble();
		total = numPeca1 * valor1 + numPeca2 * valor2;

		System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);

		sc.close();

	}
}