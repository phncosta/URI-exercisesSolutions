import java.util.Locale;
import java.util.Scanner;

public class uri1051 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		float imposto = 0.0f;
		float n = input.nextFloat();

		if (n <= 2000) {
			imposto = 0;
		} else if (n <= 3000) {
			imposto = (n - 2000f) * 0.08f;
		} else if (n <= 4500) {
			imposto = (n - 3000f) * 0.18f + (1000f * 0.08f);
		} else {
			imposto = (n - 4500f) * 0.28f + (1500f * 0.18f) + (1000f * 0.08f);
		}

		System.out.printf(n <= 2000 ? "Isento%n" : "R$ %.2f%n", imposto);

		input.close();
	}

}
